package comparatTorDemo;




import java.util.Comparator;

class AgeComparator implements Comparator<Student> {
     public int compare(Student s1,Student s2){
        if(s1.age+s1.rollNo==s2.age+ s2.rollNo)
            return 0;
        else if(s1.age+s1.rollNo<s2.age+ s2.rollNo)
            return -1;
        else
            return 1;
    }
}