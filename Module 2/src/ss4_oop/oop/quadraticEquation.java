package ss4_oop.oop;

import java.util.Scanner;

public class quadraticEquation {
    private double a, b, c;
    private double discriminant, root1, root2;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return discriminant;
    }
    public void setDiscriminant(double discriminant) {
        this.discriminant = discriminant;
    }

    public double getRoot1() {
        return root1;
    }
    public void setRoot1(double root1) {
        this.root1 = root1;
    }

    public double getRoot2() {
        return root2;
    }
    public void setRoot2(double root2) {
        this.root2 = root2;
    }

    public quadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public quadraticEquation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextDouble();
        System.out.println("Nhap b:");
        b = sc.nextDouble();
        System.out.println("Nhap c:");
        c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (delta == 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("root 1 = root 2 = " + root1);
        } else {
            System.out.println("The equation has no roots");
        }
    }
}