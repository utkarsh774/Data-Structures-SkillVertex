import java.util.*;
public class demo {

  

    public static void main(String[] args)
    {
        // String s1  =  "skillVertex";               // using string literal

        // String s2 = new String("skillVertex");     // using new keyword

        // // System.out.println(s1);
        // // System.out.println(s1);

        // Scanner scn = new Scanner(System.in);

        //1
                //       String s3  = scn.nextLine();
                //       System.out.println(s3);

                //   String s4 = scn.next();
                //   System.out.println(s4);

                //   String s5 = "Hello";
                //   System.out.println(s5.length());

                //   System.out.println(s5.charAt(2));

                //   for(int i = 0;i<s5.length();i++)
                //   {
                //       System.out.println(s5.charAt(i));
                //   }

                 // String str = "hello";
                //   int count = 0;
                //   for(int i = 0;i<str.length();i++)
                //   {
                //       for(int j = i+1;j<=str.length();j++)
                //       {
                //             count++;
                //             System.out.println(str.substring(i,j));
                //       }
                //   }
                //   System.out.println(count);
                // String str1 = "Data";
                // String str2 = "Structures";
                // String myAns1 = str1 +" "+ str2+10+20;
                //  System.out.println(myAns1);
                //  String myAns2 = 10+20+str1 +" "+ str2;
                //  System.out.println(myAns2);

            // Memory management of string


            // memory has 2 parts -> stack and heap memory
            // Inside heap memory, stringpool is present 

            // Interning -> sharing of same shell object by different identifiers is called Interning
             // Impacts of Interning
             
             // 1>  Comparision 
             // We cannot use == operator to compare instead we use .equals 

             // == , it compares string based on the address of their shell objects
             // equals first compares the string based on their address of shell objects and 
             // then based on the character array stored inside the shell object

            //  String s1 = "hello";
            //  String s2 = "hello";
            //  String s3 = new String("hello");


            // //  System.out.println(s1==s2);
            // //  System.out.println(s1==s3);


            // System.out.println(s1.equals(s2));
            // System.out.println(s1.equals(s3));

            
//==============================================================================

//StringBuilder

           StringBuilder sb = new StringBuilder();

           sb.append("hello");
           sb.append("form");
           sb.append("Skill Vertex");

           System.out.println(sb);
                 
    }
}
