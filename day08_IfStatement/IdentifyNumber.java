package day08_IfStatement;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number =200;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);




    }
}

/*
identify if the given number is positive, or negative or zero
ex
number =200
output
200 is positive number: true
200 is negative number: false
200 is zero: false
 */