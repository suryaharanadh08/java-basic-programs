import java.util.*;
class DemoHashSet{
    public static void main(String[] args) {
        HashSet s1 = new HashSet<>();
        HashSet s2 = new HashSet<>();
        HashSet s3 = new HashSet<>();
        //adding values into s1 
        s1.add("Java");
        s1.add("Python");
        s1.add("Go");
        s1.add("C");
        System.out.println(s1); //[Java, C, Go, Python]
        
        //Iterator 
        Iterator it = s1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }/* Java
            C
            Go
            Python
         */
               
        //addAll()
        s2.add("Mongo");
        s2.add("React");
        s2.addAll(s1);
        System.out.println(s2);  //[Java, C, Mongo, Go, React, Python]

        //size()
        System.out.println(s2.size()); //6

        //remove()
        s2.remove("Mongo");
        System.out.println(s2); // [Java, C, Go, React, Python]
        
        s3.add("Java");
        s3.add("SQL");
        s3.add("Go");
       
        //removeAll()
        s2.removeAll(s3);
       System.out.println(s2); // [C, React, Python]

        //retainAll()
        s1.retainAll(s3);
        System.out.println(s3); //[Java, Go, SQL]
        //clear()
        s1.clear();
        System.out.println(s1);  // []



    }
}