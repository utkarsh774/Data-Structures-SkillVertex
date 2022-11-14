import java.util.*;
public class p2 {

    public static ArrayList<Integer> removeOdd(ArrayList<Integer> al){
     
        // for(int i = 0;i<al.size();i++){
        //     int val = al.get(i);

        //     if(val%2==0){
        //         //even do nothing
        //     }
        //     else{
        //         al.remove(i);
        //     }
        // }
        // return al;

        int i = 0;
        while(i<al.size()){
            int val = al.get(i);

            if(val%2==0){
                i++;
            }
            else{
                al.remove(i);
            }
        }
        return al;
    }
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(7);
        al.add(9);
        al.add(10);
        al.add(5);
        al.add(13);
        al.add(50);
       ArrayList<Integer> ans =  removeOdd(al);
       System.out.print(ans);
    }
}
