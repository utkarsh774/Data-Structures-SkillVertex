import java.util.*;
public class p1 {
    

    public static int problem1(ArrayList<Integer> l1,ArrayList<Integer> l2){
                               
        int p1 = l1.size() - 1;
        int p2 = l2.size() - 1;

        while(p1>=0&&p2>=0){

            if(l1.get(p1)!=l2.get(p2)){
                p1--;
                p2--;
            }
            else{
                return l2.get(p2);
            }

        }
        return -1;



    }
    public static void  main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(700);
        l1.add(9);
        l1.add(10);

        l2.add(2);
        l2.add(3);
        l2.add(7);
        l2.add(11);
        l2.add(13);
       
      int ans =   problem1(l1,l2);
      System.out.println(ans);
}
}
