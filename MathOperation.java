package com.lamdaexpressions;
@FunctionalInterface
interface MathFunction {
    int calculation(int a, int b);

    static void printResult(int a, int b, String function, MathFunction fobj) {
        System.out.println("Result of " + function + " is " + fobj.calculation(a, b));
    }

    public class MathOperation {
        public static void main(String[] args) {

            MathFunction addition = (a, b) -> a + b;
            MathFunction subtraction = (a, b) -> a - b;
            MathFunction multiplication = (a, b) -> a * b;
            MathFunction division = (a, b) -> a / b;

            System.out.println("Addition " + addition.calculation(2, 3));
            System.out.println("Subtraction  " + subtraction.calculation(5, 3));

            MathFunction.printResult(4, 2, "addition", addition);
            MathFunction.printResult(6, 3, "Subtraction", subtraction);
            
        }
    }
}