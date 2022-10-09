import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
  public static void main(String[] args) {
    HashSet<Integer>hm=new HashSet<>();
    hm.add(1);
    hm.add(2);
    hm.add(8);
    hm.add(23);
    hm.add(1);
    Iterator it= hm.iterator();
    while(it.hasNext()){
        System.out.println(it.next());

    }
    //second ways to iterate
    for(Integer hm1:hm){
        System.out.println(hm1);
    }
        
    }

  }  

