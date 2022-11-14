import java.util.*;
public class demo {
    


    public static void main(String[] args)
    {
      Stack<Integer> st = new Stack<>();  // declare and initialize my stack

      st.push(10);
      st.push(20);
      st.push(30);
      System.out.println(st);
      st.pop();
      System.out.println(st);
      System.out.println(st.peek());
      System.out.println(st.size());
      st.pop();
      System.out.println(st.isEmpty());
      st.pop();
      System.out.println(st.isEmpty());


    }
}
