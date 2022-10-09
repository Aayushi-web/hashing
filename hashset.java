import java.util.HashMap;
import java.util.HashSet;

public class hashset {
  public static void main(String[] args) {
    HashSet<Integer>hm=new HashSet<>();
    hm.add(1);
    hm.add(2);
    hm.add(8);
    hm.add(23);
    hm.add(1);
    System.out.println(hm);
    if(hm.contains(7)){
        System.out.println("found!!");
    }
    else{
        System.out.println("not found!!");
    }

  }  
}
