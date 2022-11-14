public class design {
    
    public static class Customstack{

            int[] data;
            int tos;                     // data members of our stack

            public Customstack(int cap)
            {
                  //constructor
                data = new int[cap];
                tos = -1;
            }

            void push(int val)
            {
               
                if(tos == data.length - 1)
                {
                    System.out.print("Stack overflow");
                    return;
                }
                tos++;
                data[tos] = val;
            }
            int size()
            {
                return tos + 1;
            }

            boolean isEmpty()
            {
                if(tos == -1)
                {
                    return true; 
                }
                else 
                {
                    return false;
                }
            }
            
            int pop()
            {
                if(tos == -1)
                {
                    System.out.print("stack underflow");
                    return -1;
                }   
                int temp  =  data[tos];
                tos--;
                return temp;
            }

           int peek()
           {
            if(tos == -1)
            {
                System.out.print("Stack underflow");
                return -1;
            }   
            return data[tos];
           }

           void display()
           {
               for(int i = tos;i>=0;i--)
               {
                   System.out.print(data[i] + " ");
               }
           }
    }
    public static class dyanamicStack{
        public int[] data;
        int tos;                     // data members of our stack

        public dyanamicStack()
        {
              //constructor
            data = new int[10];
            tos = -1;
        }

        void push(int val)
        {
           
            if(tos == data.length - 1)
            {
                int[] arr = new int[2*data.length];

                for(int i = 0;i<data.length;i++)
                {
                    arr[i] = data[i];
                }
                
                arr[tos+1] = val;
                tos++;
                data = arr;
                return;
            }
            
            data[tos+1] = val;
            tos++;
        }
        int size()
        {
            return tos + 1;
        }

        boolean isEmpty()
        {
            if(tos == -1)
            {
                return true; 
            }
            else 
            {
                return false;
            }
        }
        
        int pop()
        {
            if(tos == -1)
            {
                System.out.print("stack underflow");
                return -1;
            }   
            int temp  =  data[tos];
            tos--;
            return temp;
        }

       int peek()
       {
        if(tos == -1)
        {
            System.out.print("Stack underflow");
            return -1;
        }   
        return data[tos];
       }

       void display()
       {
           for(int i = tos;i>=0;i--)
           {
               System.out.print(data[i] + " ");
           }
       }

    }
    public static void main(String[] args)
    {
        dyanamicStack st = new dyanamicStack();

        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.pop();
        // // st.display();
        // st.push(40);
        // st.display();
        // System.out.println();
        // System.out.print(st.peek());
        // System.out.println();
        // System.out.println(st.size());
        // System.out.print(st.isEmpty());

        for(int i = 0;i<20;i++)
        {
            st.push(i);
        }
        st.display();
       
      
      
    }
}


