package chap04;
import java.util.Scanner;

class Rectangle {
    int width;
    int hegiht;
    public int getArea() {
        return width*hegiht;
    }
}

public class Ex04_02 { 
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        rect.width = scanner.nextInt();
        rect.hegiht = scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
    }
}