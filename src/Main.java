import task1.CountMap;
import task1.CountMapImpl;

public class Main {
    public static void main(String[] args) {

        CountMap<String> cmap = new CountMapImpl<>();

        System.out.println();
        cmap.add("g");
        cmap.add("r");
        cmap.add("g");
        cmap.add("g");
        cmap.add("f");
        cmap.add("f");
        cmap.add("fa");
        cmap.add("fq");

        System.out.println(cmap.toMap());
    }
}
