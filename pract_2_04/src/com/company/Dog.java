package com.company;

public class Dog {

    private String name;
    private int age;

    // Конструктор без параметров.
    public Dog() {
        this.name = "Собака";
        this.age = 0;
    }

    // Конструктор с параметром клички на вход.
    public Dog(String name) {
        this.name = name;
    }

    // Конструктор с параметром клички и возраста на вход.
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Свойство - изменение возраста.
    public void setAge(int age) {
        this.age = age;
    }

    // Свойство - получение возраста.
    public int getAge() {
        return age;
    }

    // Свойство - смена имени.
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return this.name + ", возраст " + this.age;
    }

    // Перевод возраста собаки в человеческий.
    public void toHumanAge() {
        System.out.println("Возраст собаки по кличке " + name + " в человеческих годах - " + age * 7);
    }
}
