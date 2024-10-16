package TreeSet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> setInt = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            setInt.add(value);
        }
        System.out.println(setInt);
        System.out.println("Phần tử nhỏ nhất:"+setInt.first());
        System.out.println("Phần tử lớn nhất:"+setInt.last());
        System.out.println("Phần tử lớn nhất và <5:"+setInt.lower(5));
        System.out.println("Phần tử nhỏ nhất và >5:"+setInt.higher(5));
        System.out.println("Phần tử nhỏ nhất và >=5:"+setInt.ceiling(5));
        System.out.println("Phần tử lớn nhất và <=5:"+setInt.floor(5));
        setInt.pollFirst();
        System.out.println("Xóa phần tử đầu tiên:"+setInt);
        setInt.pollLast();
        System.out.println("Xóa phần tử cuối cùng:"+setInt);
        System.out.println("Phần tử lớn hơn 5: "+setInt.tailSet(5));
        System.out.println("Phần tử bé hơn 5:"+setInt.headSet(5));



        LinkedHashSet<Integer> set1=new LinkedHashSet<>();
        for(int i=0;i<10;i++){
            set1.add(i);
        }
        LinkedHashSet<Integer> set2=new LinkedHashSet<>();
        for(int i=6;i<20;i+=2){
            set2.add(i);
        }
        System.out.println(set1);
        System.out.println(set2);
        set1.addAll(set2);
//        set1.remove(2);
//        set1.removeAll(set2);
//        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set1.contains(2));
    }
}
