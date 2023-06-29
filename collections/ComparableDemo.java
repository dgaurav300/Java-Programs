package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

class Student implements Comparable {

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
    public int compareTo(Object o) {

        Student student =(Student)o;
        if (this.marks > student.getMarks()) {
            return 1;
        } else if (this.marks < student.getMarks()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Marks: " + marks + "\n";
    }
}

class ComparableDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Alex", 88);
        Student s2 = new Student("Bob", 90);
        Student s3 = new Student("Joe", 78);

        ArrayList<Student> studentList=new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println("Student details are:");

        ListIterator li = studentList.listIterator();
while(li.hasNext())
{
System.out.println(li.next());
}

Collections.sort(studentList);

System.out.println("Student details after sorting are:");
ListIterator li2 = studentList.listIterator();
while(li2.hasNext())
{
System.out.println(li2.next());
}

    }
}