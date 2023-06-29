package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
class NameCompare implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        Student x = (Student) o1;
        Student y = (Student) o2;
        return x.getName().compareTo(y.getName());
    }
    
}
class MarkCompare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student x = (Student) o1;
        Student y = (Student) o2;
        if (x.getMarks() > y.getMarks())
            return 1;
        else if (x.getMarks() < y.getMarks())
            return -1;
        else
            return 0;
    }

}

class Student {

    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Marks: " + marks + "\n";
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Alex", 88);
Student s2 = new Student("Bob", 90);
Student s3 = new Student("Joe", 78);
ArrayList<Student> obj = new ArrayList<Student>();
obj.add(s1);
obj.add(s2);
obj.add(s3);
System.out.println("Student details are:");
ListIterator<Student> li = obj.listIterator();
while(li.hasNext())
{
System.out.println(li.next());
}
Collections.sort(obj,new MarkCompare());
System.out.println("Sorting Data Marks Wise");
ListIterator<Student> li2 = obj.listIterator();
while(li2.hasNext())
{
System.out.println(li2.next());
}
System.out.println("Sorting Data Name Wise");
Collections.sort(obj,new NameCompare());
ListIterator<Student> li3 = obj.listIterator();
while(li3.hasNext())
{
System.out.println(li3.next());
}

    }
}
