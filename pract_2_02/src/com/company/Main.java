package com.company;
import java.util.Scanner;




public class Main {


    public static class Ball {
        private  int radius;

        public Ball(int radius) {
            this.radius = radius;
        }

        public Ball() {
            this.radius = 1;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Радиус шара = " + radius;

        }

        public int getDiametr(){
            return 2*radius;
        }
    }
    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1 = new Ball(8);
        System.out.println(b1);
        System.out.println("Диаметр шара = " + b1.getDiametr());
    }

}
