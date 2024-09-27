import java.util.*;
class Demo{
    public static void main(String[] args){

        Map m1 = new HashMap();
        m1.put(1,"surya");
        m1.put("no","sur");
        m1.put(3,true);
        System.out.println(m1.keySet()+"  "+m1.values()+"  "+m1.containsKey(2));
    }
}