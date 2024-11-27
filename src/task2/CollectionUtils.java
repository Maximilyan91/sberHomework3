package task2;

import java.util.*;

public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List newArrayList() {
        return Collections.EMPTY_LIST;
    }

    public static <T> int indexOf(List<? extends T> source, Object o) {
       return source.indexOf(o);
    }

    public static <T> List limit(List<? extends T> source, int size) {
       return source.subList(0, size);
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? extends T> c, List<? extends T> c2) {
       return new HashSet<>(c).containsAll(c2);
    }

    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T t : c2) {
            if (c1.contains(c2)) {
                return true;
            }
        }
        return false;
    }

    public static List range(List list, Object min, Object max) {
    }

    public static List range(List list, Object min, Object max, Comparator comparator) {
    }
}