package sec01.ex02;

import sec01.ex01.College;
import sec01.ex01.Employee;
import sec01.ex01.Person;
import sec01.ex01.Student;

import java.util.ArrayList;
import java.util.List;

public class SuperTypeTest {
    public static void printEmployeeList(List<? super Employee> list) {     // Employee 클래스와 그 상위 클래스 타입을 저장한 List만 전달
        for (Object obj : list) {
            System.out.println(((Employee) obj).getSalary());
        }
    }

    public static void printStudentList(List<? super Student> list) {       // Student 클래스와 그 상위 클래스 타입을 저장한 List만 전달
        for (Object obj : list) {
            System.out.println(((Student) obj).getGrade());
        }
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("홍길동"));
        personList.add(new Person("이길동"));
        personList.add(new Person("김길동"));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("홍길동", 1000000));
        employeeList.add(new Employee("아길동", 2000000));
        employeeList.add(new Employee("김길동", 3000000));

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 1));
        studentList.add(new Student("이길동", 2));
        studentList.add(new Student("김길동", 3));

        List<College> collegeList = new ArrayList<>();
        collegeList.add(new College("홍길동", 1, 20));
        collegeList.add(new College("이길동", 2, 21));
        collegeList.add(new College("김길동", 3, 22));

        printEmployeeList(personList);    // Person과 Employee로 지정한 ArrayList만 전달 가능
        printEmployeeList(employeeList);

        printStudentList(personList);    // Person과 Student로 지정한 ArrayList만 전달 가능
        printStudentList(studentList);



    }
}