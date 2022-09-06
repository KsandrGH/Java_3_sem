package com.company;

public class Main {

    public static class Dog {
        private String name;
        private int age;

        // Конструктор с параметром имени и возраста
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Свойство - изменение возраста.
        public void setAge(int age) {
            this.age = age;
        }

        // Свойство - изменение имени.
        public void setName(String name) {
            this.name = name;
        }

        // Свойство - получение возраста.
        public int getAge() {
            return age;
        }
        
        public String toString() {
            return this.name + ", возраст " + this.age;
        }
        
        public void toHumanAge() {
            System.out.println("Возраст собаки по кличке " + name + " в \"человеческий\": " + age * 7 + " лет");
        }
    }


    public static void main(String[] args) {
        Dog d1 = new Dog("Жучка", 6);
        Dog d2 = new Dog("Мухтар", 3);
        Dog d3 = new Dog("Бекки", 5);
        Dog d4 = new Dog("Сэм", 2);
        Dog d5 = new Dog("Пушиш", 4);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

        d1.toHumanAge();
        d2.toHumanAge();
        d3.toHumanAge();
        d4.toHumanAge();
        d5.toHumanAge();
    }

}
