package task1;

public class Task1App {
    public static void main(String[] args) {

        CountMap<String> cmap = new CountMapImpl<>();
        CountMap<String> source = new CountMapImpl<>();

        cmap.add("1");
        cmap.add("2");
        cmap.add("2");
        cmap.add("2");
        cmap.add("3");
        cmap.add("3");
        cmap.add("3");
        cmap.add("3");

        cmap.remove("3");
        cmap.remove("1");

        source.add("1");
        source.add("2");
        source.add("2");
        source.add("3");
        source.add("3");
        source.add("3");
        source.add("4");
        source.add("4");
        source.add("4");
        source.add("4");
        source.add("0");

        System.out.println();


        System.out.println("cmap " + cmap.toMap());

        cmap.addAll((source));
        System.out.println(source.toMap());
        System.out.println(cmap.toMap());
    }
}
