package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class DemoHashSet {
    public static void main(String[] args) {
        //add contain
        HashSet<String> string = new HashSet<>();
        string.add("A");
        string.add("B");
        string.add("C");
        string.add("B");
        System.out.println(string);
        System.out.println(string.contains("A"));
        //remove
        HashSet<Double> dble = new HashSet<>();
        dble.add(9.8);
        dble.add(8.0);
        dble.add(6.7);
        dble.add(7.9);
        dble.add(9.8);
        System.out.println(dble);
        dble.remove(6.7);
        System.out.println(dble);


        //addAll removeAll retainAll
        HashSet<Integer> set1 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            set1.add(i);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 4; i < 14; i++) {
            set2.add(i);
        }
//        set1.addAll(set2);
//        set1.removeAll(set2);
//        set1.retainAll(set2);
        System.out.println(set1);


        HashSet<Fruit> fruitSet = new HashSet<>();
        fruitSet.add(new Fruit("Banana", 30));
        fruitSet.add(new Fruit("Apple", 34));
        fruitSet.add(new Fruit("Pear", 23));
        fruitSet.add(new Fruit("Banana", 30));
        System.out.println(fruitSet);
        System.out.println(fruitSet.size());
    }
}
