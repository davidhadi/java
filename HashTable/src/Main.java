import java.util.Hashtable;
import java.util.Enumeration;
public class Main {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        ht.put("Item1","Apple");
        ht.put("Item2","Orange");
        ht.put("Item3","Grapes");
        ht.put("Item4","Pine");

        Enumeration e = ht.keys();

        while(e.hasMoreElements()){
            String str = (String) e.nextElement();
            System.out.println(ht.get(str));
        }
    }
}
