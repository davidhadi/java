import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args){
        TreeSet<String> tree = new TreeSet<>();
        Stack st = new Stack();
        tree.add("Shakil");
        tree.add("Varshu");
        tree.add("Nidhi");
        tree.add("Abhishek");
        tree.add("Kajal");

        st.push(5);
        st.push(6);
        st.push(78);
        st.push(63);
        st.push(95);
        st.pop();
        st.pop();
        st.add(2,60);
        st.toArray();
        st.pop();

       if(st.empty())
           System.out.println("Stsack is empty !");
       else
           System.out.println("Stsack is not empty !");
       System.out.println("Set : "+st);
        Iterator iterator = tree.iterator();
        while(iterator.hasNext())
              System.out.println("Set : "+ iterator.next());
    }
}
