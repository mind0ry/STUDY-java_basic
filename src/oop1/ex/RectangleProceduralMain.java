package oop1.ex;

import java.util.Scanner;

public class RectangleProceduralMain {

    public static void main(String[] args) {
        RectangleProcedural rec = new RectangleProcedural();
        Scanner scanner = new Scanner(System.in);
        System.out.print("width: ");
        rec.width = scanner.nextInt();
        System.out.print("height: ");
        rec.height = scanner.nextInt();

        int area = rec.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = rec.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = rec.isSquare();
        System.out.println("정사각형 여부: " + square);
    }

}