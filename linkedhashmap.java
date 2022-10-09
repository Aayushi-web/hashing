import java.util.LinkedHashMap;

public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm= new LinkedHashMap<>();
        lhm.put("America", 100);
        lhm.put("europe", 20);
        lhm.put("India", 80);
        lhm.put("China", 70);
        System.out.println(lhm);
        //differnce bt hashmap and linkedhashmap is the insertion order the inorder in which y=we put/insert the same it willl print

    }
}
