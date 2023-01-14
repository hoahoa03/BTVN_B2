package Ktra_buoi_cuoi.Cau2;

import java.util.Scanner;

public class Person 
{
    protected String name ;
    protected int age ;
    protected String gender ;
    protected String phone ;

    public Person(String name, int age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    static Scanner sc = new Scanner(System.in) ;
    
    public void input()
    {
        System.out.println("Nhap vao ten nguoi yeu: ") ;
        setName( sc.nextLine() ) ;
        System.out.println("Nhap vao tuoi nguoi yeu: ") ;
        setAge( sc.nextInt() ) ;
        sc.nextLine() ;
        System.out.println("Nhap vao gioi tinh nguoi yeu: ") ;
        setGender( sc.nextLine() ) ;
        System.out.println("Nhap vao SDT nguoi yeu: ") ;
        setPhone( sc.nextLine() ) ;
    }
    
    public void output()
    {
        System.out.println("Ten nguoi yeu: " + getName()) ;
        System.out.println("Tuoi nguoi yeu: " + getAge()) ;
        System.out.println("Gioi tinh nguoi yeu: " + getGender()) ;
        System.out.println("SDT nguoi yeu: " + getPhone()) ;
        sc.nextLine() ;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + ", phone=" + phone + '}';
    }
    
    
    
    
    
}
