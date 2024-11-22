package task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountMapImpl<T> implements CountMap<T> {

    private Map<T, Integer> count;

    public CountMapImpl() {
        count = new HashMap<>();
    }

    @Override
    public void add(T t) {
        if (!count.containsKey(t)) {
            count.put(t, 1);
        } else {
            count.replace(t, count.get(t) + 1);
        }
    }

    @Override
    public int getCount(T t) {
        return count.getOrDefault(t, -1);
    }

    @Override
    public int remove(T t) {
        if (count.containsKey(t)) {
            return count.remove(t);
        } else {
            return -1;
        }
    }

    @Override
    public int size() {
        return count.size();
    }
//Добавить все элементы из source в текущий контейнер,
    // при совпадении ключей,     суммировать значения
    @Override
    public void addAll(CountMap<? extends T> source) {
        Set<? extends Map.Entry<? extends T, Integer>> entries = source.toMap().entrySet();
    }

    @Override
    public Map<T, Integer> toMap() {
        return count;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
 //       destination.putAll(count);
    }
}
