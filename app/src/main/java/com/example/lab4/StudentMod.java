package com.example.lab4;

public class StudentMod {
    private int ID;
    private  String name;
    private  int age;

    public StudentMod(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "StudentMod{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
