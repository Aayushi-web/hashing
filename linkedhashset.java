import java.util.LinkedHashSet;
import java.util.TreeSet;

public class linkedhashset {
   public static void main(String[] args) {
    LinkedHashSet<String>str = new LinkedHashSet<>();
    str.add("delhi");
    str.add("mumbai");
    str.add("kolkata");
    str.add("chennai");
    str.add("nashik");
    System.out.println(str);
    TreeSet<String> tree=  new TreeSet<>();
    tree.add("boolean");
    tree.add("string");
    tree.add("Integer");
    tree.add("Floating");
    System.out.println(tree);

   } 
}
