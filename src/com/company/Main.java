package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 4);
        System.out.println("S = " + rect.s() +
                "\nP = " + rect.p());

        Square square = new Square(4);
        System.out.println("S = " + square.s() +
                "\nP = " + square.p());

        Circle circle = new Circle(2);
        System.out.println("S = " + circle.s() +
                "\nP = " + circle.p());

        Triangle triangle = new Triangle(1, 2, 2);
        System.out.println("S = " + triangle.s() +
                "\nP = " + triangle.p());

        Figure[] figure = {rect, square, circle, triangle};
        for (Figure el :
                figure) {
            System.out.println(el);
        }
    }
}
