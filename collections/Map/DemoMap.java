import java.util.*;
class DemoMap{
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap();
        Map<Integer,String> m2 = new HashMap();
        m.put(1,"Tony");
        m.put(2,"Alex");
        m.put(3,"Kevin");
        
        m2.put(0,"surya");
        m2.putAll(m); //putAll()
        System.out.println(m2.values());

        m2.remove(3,"Kevin"); //remove()
        System.out.println(m2.values());

        System.out.println(m2.size()); //size()

        System.out.println(m2.containsKey(3));
        System.out.println(m.keySet()); //getting keys
        System.out.println(m.values()); //getting values
    
        Set s = m.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry m1 = (Map.Entry) it.next();
            System.out.println(m1.getKey() +"  "+m1.getValue());
        }
    
    }

}