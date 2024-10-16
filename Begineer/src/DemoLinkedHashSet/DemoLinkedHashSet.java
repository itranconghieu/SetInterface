package DemoLinkedHashSet;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> string = new LinkedHashSet<>();
        //add linkedHashSet
        string.add("A");
        string.add("D");
        string.add("C");
        string.add("B");
        string.add("B");
        System.out.println(string);
        System.out.println(string.size());
        //remove
        string.remove("B");
        System.out.println(string);
        System.out.println(string.size());
        //contain
        System.out.println(string.contains("A"));
        //addAll removeAll retainAll
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0; i <= 10; i++) {
            set1.add(i);
        }
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        for (int i = 20; i > 5; i -= 2) {
            set2.add(i);
        }
        System.out.println(set1);
        System.out.println(set2);
        set1.addAll(set2);
//        set1.removeAll(set2);
//        set1.retainAll(set2);
        System.out.println(set1);
    }
}
