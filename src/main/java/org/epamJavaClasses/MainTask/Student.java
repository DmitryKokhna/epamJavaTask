package org.epamJavaClasses.MainTask;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public int getYearOfStudy() {
        return YearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        YearOfStudy = yearOfStudy;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
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

    public static void main(String[] args) {
        Student[] arrStudent=new Student[30];
        Student one=new Student(1, "Kokhna","Dima","Alekseev","Minsk","+375295658565","FES",2,"TE342");
    }
}
