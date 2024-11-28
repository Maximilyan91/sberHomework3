package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2App {
    public static void main(String[] args) {

        List<Integer> listInts1 = new ArrayList<>();
        List<Integer> listInts2 = new ArrayList<>();
        Random g = new Random();

        for (int i = 0; i < 15; i++) {
            listInts1.add(g.nextInt());
            listInts2.add(g.nextInt());
        }
    }
}
