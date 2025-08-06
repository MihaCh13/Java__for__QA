package lec_01.Class;

public class Operators {
    public static void main(String[] args){
        int numberOne = 100;
        int numberTwo = 30;

        System.out.println(numberOne + numberTwo);
        System.out.println(numberOne - numberTwo);
        System.out.println(numberOne * numberTwo);
        System.out.println(numberOne / numberTwo);
        System.out.println(numberOne % numberTwo);
        System.out.println(++numberOne);
        System.out.println(--numberTwo);

        double numberDivision = (double) numberOne / numberTwo;
        System.out.println(numberDivision);
        System.out.println((double) numberOne / numberTwo);
    }
}