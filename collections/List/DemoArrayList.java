import java.util.*;

class DemoArrayList{
    public static void main(String[] args) {
        List l1 = new ArrayList<>();
        List l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<String>();
        //adding elements
        l1.add("surya");
        l1.add("Hara Nadh");
        l1.add(5403);
        System.out.println(l1); // [surya, Hara Nadh, 5403]
       
        //addAll()
        l2.addAll(l1);
        l2.add(2,"Miracle");
        System.out.println(l2);  //[surya, Hara Nadh, Miracle, 5403]

        //size()
        System.out.println(l2.size()); //4

        //get()
        System.out.println(l1.get(2)); //5403

        //remove()
        l1.remove("surya");
        System.out.println(l1); // [Hara Nadh, 5403]
        
        //removeAll()
        l2.removeAll(l1);
       System.out.println(l2); //[surya, Miracle]

        //retainAll()
        l3.add("surya");
        l3.add("Hara");
        l3.add("Nadh");
        l3.retainAll(l2);
        System.out.println(l3); //[surya]

        //clear()
        l1.clear();
        System.out.println(l1);  // []

        //Iterator , hasNext() , next() , remove
        Iterator it = l2.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); // surya Miracle
            //it.remove();
        }
        System.out.println("");

        //ListIterator
        ListIterator it2 = l2.listIterator();
        
        //loop through array contents in forward direction
        while(it2.hasNext()){
            System.out.println(it2.next());  // surya Miracle
            
        }
        System.out.println("");
        
        //loop through array contents in backward direction
        while(it2.hasPrevious()){
            System.out.println(it2.previous());  //Miracle surya
            
        }
      
    }
}