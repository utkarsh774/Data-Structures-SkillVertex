import java.util.*;
public class Intro {
    


    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(5);
        al.add(10);
        al.add(50);
        System.out.println(al);
        al.add(2,30);
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.set(2,300));
        System.out.println(al);
       al.remove(3);
       System.out.println(al);
       System.out.println(al.size());
}
}