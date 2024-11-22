package task1;

import java.util.Map;

public interface CountMap<T> {

         void add(T t);

        int getCount(T t);

         int remove(T t);

        int size();

        //Добавить все элементы из source в текущий контейнер,
        // при совпадении ключей,     суммировать значения
        void addAll(CountMap<? extends T> source);

        //Вернуть java.util.Map. ключ - добавленный элемент,
        // значение - количество его добавлений
        Map<T, Integer> toMap();

        //Тот же самый контракт как и toMap(), только всю информацию записать в destination
        void toMap(Map<T, Integer> destination);

}
