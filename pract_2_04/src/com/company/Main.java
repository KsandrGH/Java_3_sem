package com.company;

public class Main {

    public static class Dog {
        private String name;
        private int age;

        // ����������� � ���������� ����� � ��������
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // �������� - ��������� ��������.
        public void setAge(int age) {
            this.age = age;
        }

        // �������� - ��������� �����.
        public void setName(String name) {
            this.name = name;
        }

        // �������� - ��������� ��������.
        public int getAge() {
            return age;
        }
        
        public String toString() {
            return this.name + ", ������� " + this.age;
        }
        
        public void toHumanAge() {
            System.out.println("������� ������ �� ������ " + name + " � \"������������\": " + age * 7 + " ���");
        }
    }


    public static void main(String[] args) {
        Dog d1 = new Dog("�����", 6);
        Dog d2 = new Dog("������", 3);
        Dog d3 = new Dog("�����", 5);
        Dog d4 = new Dog("���", 2);
        Dog d5 = new Dog("�����", 4);

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
