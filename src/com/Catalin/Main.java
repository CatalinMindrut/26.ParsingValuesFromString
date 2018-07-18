package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /** Parsing a value from a string means that you will have to convert that string into a certain
         * primitive data type, int, double etc.
         * This can be used when reading input from a user.
         */
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);
        /**To convert the string we're using a class called Integer. This is a wrapper class.
         * The wrapper class includes some useful static methods like the one used above "parseInt".
         * This method will try to convert a string that we're passing as an argument.
         */

        numberAsString += 1;
        /** The result here will be 20181, because the number will be converted to a String and then both
         * String will be concatenated into 20181.
         */
        number += 1;
        /** The result here will be 2019, because number converted the string to an integer, using the
         * wrapper class. So the number is considered an integer and it can be summed up with 1 resulting
         * in 2019.
         */

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        /** Test: let's say that the user typed in, by mistake, an invalid character, for example,
         * instead of 2018, he wrote 2018a.
         * In this case, java will return an error because the according to the code, the string should
         * be converted to a number but 2018a is not a valid number.
         */

        /** The String can also be converted in other data types like the double:
         */
        String numberAsStrings = "2018.125";
        System.out.println("numberAsString = " + numberAsStrings);

        double value = Double.parseDouble(numberAsStrings);
        System.out.println("value = " + value);

        numberAsStrings += 1;
        value += 1;

        System.out.println("numberAsStrings = " + numberAsStrings);
        System.out.println("value = " + value);
        /** Same as before, 1 will be concatenated with the string 2018.125 resulting in 2018.1251;
         * In the case of the value, that was converted to a double data type, the 1 will be added to 2018.125,
         * resulting in 2019.125.
         */


    }
}
