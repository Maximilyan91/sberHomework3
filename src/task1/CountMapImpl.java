package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountMapImpl<T> implements CountMap<T> {

    private final Map<T, Integer> count;

    public CountMapImpl() {
        count = new HashMap<>();
    }

    @Override
    public void add(T t) {
        int value = count.getOrDefault(t, 0);
        count.put(t, value + 1);
    }

    @Override
    public int getCount(T t) {
        return count.getOrDefault(t, 0);
    }

    @Override
    public int remove(T t) {
        int value = count.getOrDefault(t, 0);

        if (value > 1) {
            return count.put(t, value - 1);
        } else {
           return count.remove(t);
        }
    }

    @Override
    public int size() {
        return count.size();
    }

    @Override
    public void addAll(CountMap<? extends T> source) {
        Set<? extends Map.Entry<? extends T, Integer>> entries = source.toMap().entrySet();

        for (Map.Entry<? extends T, Integer> entry : entries) {
            T key = entry.getKey();

            if (count.containsKey(key)) {
                count.put(key, count.get(key) + entry.getValue());
            } else {
                count.put(key, entry.getValue());
            }
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return count;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
            destination.putAll(count);
    }
}
