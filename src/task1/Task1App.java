package task1;

public class Task1App {
    public static void main(String[] args) {

        CountMap<String> cmap = new CountMapImpl<>();
        CountMap<String> sourceMap = new CountMapImpl<>();

        cmap.add("1");
        cmap.add("2");
        cmap.add("2");
        cmap.add("2");
        cmap.add("3");
        cmap.add("3");
        cmap.add("3");
        cmap.add("3");

        System.out.println("начальные элементы countMap: \n" + cmap.toMap() + "\n");

        sourceMap.add("1");
        sourceMap.add("2");
        sourceMap.add("2");
        sourceMap.add("3");
        sourceMap.add("3");
        sourceMap.add("3");
        sourceMap.add("4");
        sourceMap.add("4");
        sourceMap.add("4");
        sourceMap.add("4");
        sourceMap.add("0");

        System.out.println("Начальные элементы sourceMap: \n" + sourceMap.toMap() + "\n");
        System.out.println("Количество повторений элемента \"2\" в countMap: " + cmap.getCount("2")); // 2

        System.out.println("\nУдаление элемента \"2\"");
        System.out.println("Количество элемента \"2\" до удаления: " + cmap.remove("2"));
        System.out.println(cmap.toMap());

        System.out.println("\nДобавление всех элементов из sourceMap в countMap");
        cmap.addAll(sourceMap);
        System.out.println(cmap.toMap());
    }
}
