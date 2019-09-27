package com.stackroute.pe5;

import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student(){}
}

class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if(a.getAge() != b.getAge())
            return b.getAge()-a.getAge();
        else if(a.getName() != b.getName())
            return a.getName().compareTo(b.getName());
        else
            return a.getId()-b.getId();
    }
}

class Manifest {
    public List<Student> create() {
        List<Student> s = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of students: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter id, name, age: ");
            Student studentDetail = new Student();
            studentDetail.setId(sc.nextInt());
            studentDetail.setName(sc.next());
            studentDetail.setAge(sc.nextInt());
            s.add(studentDetail);
        }
        return s;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Manifest mn = new Manifest();
        List<Student> dets = mn.create();
        Collections.sort(dets, new StudentSorter());
        for(int j=0;j<dets.size();j++) {
            System.out.println(dets.get(j).getName());
        }
    }
}
