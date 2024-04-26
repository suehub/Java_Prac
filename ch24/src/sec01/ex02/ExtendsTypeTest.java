package sec01.ex02;

import sec01.ex01.College;
import sec01.ex01.Employee;
import sec01.ex01.Person;
import sec01.ex01.Student;

import java.util.ArrayList;
import java.util.List;

public class ExtendsTypeTest {
    public static void printPersonList(List<?> list) {  // 모든 클래스 객체가 저장된 List 타입을 전달
        for(Object obj : list) {
            System.out.println(((Person)obj).getName());
        }
    }

    public static void printEmployeeList(List<? extends Employee> list) {   // Employee 클래스와 하위 클래스 타입만 전달 가능
        for(Employee employee : list) {
            System.out.println(employee.getSalary());
        }
    }

    public static void printStudentList(List<? extends Student> list) {     // Student 클래스와 하위 클래스 타입만 전달 가능
        for(Student student : list) {
            System.out.println(student.getGrade());
        }
    }

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("홍길동"));
        personList.add(new Person("이길동"));
        personList.add(new Person("김길동"));

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("홍길동", 1000000));
        employeeList.add(new Employee("아길동", 2000000));
        employeeList.add(new Employee("김길동", 3000000));

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("홍길동", 1));
        studentList.add(new Student("이길동", 2));
        studentList.add(new Student("김길동", 3));

        List<College> collegeList = new ArrayList<College>();
        collegeList.add(new College("홍길동", 1, 20));
        collegeList.add(new College("이길동", 2, 21));
        collegeList.add(new College("김길동", 3, 22));

        printPersonList(personList);    // 모든 클래스 타입의 ArrayList가 매개변수로 전달됨
        printPersonList(employeeList);
        printPersonList(studentList);
        printPersonList(collegeList);

        printEmployeeList(employeeList);    // Employee 클래스 타입의 ArrayList만 매개변수로 전달됨

        printStudentList(studentList);      // Student 클래스와 하위 클래스 타입의 ArrayList만 매개변수로 전달
        printStudentList(collegeList);



    }
}
