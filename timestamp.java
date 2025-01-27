import java.util.*;
public class timestamp {
    Queue<Integer>hits=new LinkedList<>();
        public void hits(int value)
        {
            hits.add(value);
        }
        public int gethits(int timestamp,int k)
        {
            int x=timestamp-k*60;
            while(!hits.isEmpty()&&hits.peek()<=x)
            {
                hits.poll();
            }
            return hits.size();

        }
        public static void main(String args[])
        {
            timestamp st=new timestamp();
            st.hits(2);
            st.hits(160);
            st.hits(210);
            st.hits(300);

            st.hits(720);
            st.hits(900);
            st.hits(10);
            System.out.println("time stamp"+st.gethits(120,2)); 
            System.out.println("time stamp"+st.gethits(500,4));


        }
    
}
