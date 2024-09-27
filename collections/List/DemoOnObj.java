
import java.util.*;

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
        }
    }
class DemoOnObj{
    public static void main(String[] args) {
    ArrayList<Student> al = new ArrayList<>();
    Student s1 = new Student(1,"surya");        
    Student s2 = new Student(2,"Hari");
    al.add(s1);
    al.add(s2);
    Iterator it = al.iterator();
    while(it.hasNext()){
        Student st = (Student)it.next();
        System.out.println(st.id+", "+st.name);
    }

    }
}