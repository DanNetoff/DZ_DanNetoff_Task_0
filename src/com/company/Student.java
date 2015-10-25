package com.company;

import java.util.Date;

/**
 * Created by Dan on 24.10.2015.
 */
public class Student implements Comparable{

    private Integer id;
    private String firstName;
    private String name;
    private String sName;
    private Date birthDay;
    private String Adress;
    private String phoneNumber;

    public Student(int id, String firstName, String name, String sName, Date birthDay, String adress, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.sName = sName;
        this.birthDay = birthDay;
        Adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public Student(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Student(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Student)
        {
            return this.id.compareTo(((Student)o).getId());
        }

        return 0;

    }


    // 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,

    //     Факультет, Курс, Группа.

    //           Создать массив объектов. Вывести:
}
