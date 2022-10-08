import java.util.HashMap;
import java.util.Set;


public class hashing1{
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        //add operation
map.put("india", 50);
map.put("kolkata", 20);
map.put("chennai", 8);
map.put("goa", 70);
System.out.println(map);
// get operation

int population=map.get("goa");
System.out.println(population);
//contains key  operation
System.out.println(map.containsKey("indiaa"));
//contains value
System.out.println(map.containsValue(20));
//remove key

System.out.println(map.remove("india"));
System.out.println(map);
System.out.println(map.size());
System.out.println(map.isEmpty());
// map.clear();
// System.out.println(map);
Set<String> key= map.keySet();
System.out.println(key);
for (String key1 : key) {
   System.out.println("key ="+key1+","+"value= "+map.get(key1)); 
}
    }
}