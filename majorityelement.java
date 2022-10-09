import java.util.HashMap;
import java.util.Set;

public class majorityelement {
    public static void main(String[] args) {
        int hash[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer>element= new HashMap<>();
        for(int i=0;i<hash.length;i++){
            if(element.containsKey(hash[i])){
                element.put(hash[i], element.get(hash[i])+1);
            }else{
               element.put(hash[i], 1);
            }
        }
        Set<Integer>keyset= element.keySet();
        for(Integer key:keyset){
            if(element.get(keyset)>hash.length/3){
                System.out.println(key);
            }
        }
    }
}
