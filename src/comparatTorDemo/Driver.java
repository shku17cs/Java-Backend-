package comparatTorDemo;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name");
//Using NameComparator to sort the elements
        Collections.sort(al,new AgeComparator());
        for(Student st: al){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}
