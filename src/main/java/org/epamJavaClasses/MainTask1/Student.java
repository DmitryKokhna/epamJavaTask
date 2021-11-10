package org.epamJavaClasses.MainTask1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/**
 * Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * <p>
 * 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
 * <p>
 * Создать массив объектов. Вывести:
 * <p>
 * a) список студентов заданного факультета;
 * <p>
 * b) списки студентов для каждого факультета и курса;
 * <p>
 * c) список студентов, родившихся после заданного года;
 * <p>
 * d) список учебной группы.
 */

public class Student {

    private int id;
    private String SecondName;
    private String FirstName;
    private String Patronymic;
    private String Address;
    private String Phone;
    private String Faculty;
    private int YearOfStudy;
    private String Group;


    public Student(int id, String secondName, String firstName, String patronymic, String address, String phone, String faculty, int yearOfStudy, String group) {
        this.id = id;
        SecondName = secondName;
        FirstName = firstName;
        Patronymic = patronymic;
        Address = address;
        Phone = phone;
        Faculty = faculty;
        YearOfStudy = yearOfStudy;
        Group = group;


    }



    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getSecondName() {
        return SecondName;
    }

    public  void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public  String getFirstName() {
        return FirstName;
    }

    public  void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public  String getPatronymic() {
        return Patronymic;
    }

    public  void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public  String getAddress() {
        return Address;
    }

    public  void setAddress(String address) {
        Address = address;
    }

    public  String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public  String getFaculty() {
        return Faculty;
    }

    public  void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public  int getYearOfStudy() {
        return YearOfStudy;
    }

    public  void setYearOfStudy(int yearOfStudy) {
        YearOfStudy = yearOfStudy;
    }

    public  String getGroup() {
        return Group;
    }

    public  void setGroup(String group) {
        Group = group;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", SecondName='" + SecondName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Patronymic='" + Patronymic + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone=" + Phone +
                ", Faculty='" + Faculty + '\'' +
                ", YearOfStudy=" + YearOfStudy +
                ", Group='" + Group + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Введите общее количество студентов");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int setSize=Integer.parseInt(bufferedReader.readLine());

        Student[] arrayOfStudent=new Student[setSize];

        for (int i=0;i<setSize;i++){
     //ввоим ID
    System.out.println("введите ID студента");
    int setId = Integer.parseInt(bufferedReader.readLine());
    // вводим Фамилию
    System.out.println("введите Фамилию студента");
   String setSecondName=bufferedReader.readLine();
    //вводим Имя
    System.out.println("введите Имя студента");
   String setFirstName=bufferedReader.readLine();
    //вводим Отчество
    System.out.println("введите Отчество студента");
   String setPatronymic= bufferedReader.readLine();
    //вводим Адрес
    System.out.println("введите Адрес студента");
   String setAddress=(bufferedReader.readLine());
    //вводим Телефон
    System.out.println("введите Телефон студента");
   String setPhone=bufferedReader.readLine();
    //вводим Факультет
    System.out.println("введите Факультет студента");
   String setFaculty=bufferedReader.readLine();
    //вводим Год учебы
    System.out.println("введите Год учебы студента");
  int setYearOfStudy=Integer.parseInt(bufferedReader.readLine());
    //вводим Группу
    System.out.println("введите Группу студента ");
   String setGroup= bufferedReader.readLine();

   Student student=new Student(setId,setSecondName,setFirstName,setPatronymic,setAddress,setPhone,setFaculty,setYearOfStudy,setGroup);

   arrayOfStudent[i]=student;
}

        System.out.println(arrayOfStudent[1].toString());
    }



}
