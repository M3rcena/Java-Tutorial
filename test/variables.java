package test;

public class variables {
    public static void main(String[] args) {
        // How to use variables and operations
        int test = 5;
        double test2 = 5.5;

        double test3 = test + test2;

        System.out.println("Print operation: " + test3);

        // How to transform a number into a string
        String test4 = Integer.toString(test);
        System.out.println("String Number: " + test4 );

        // How to transform a string into a number
        int test5 = Integer.parseInt(test4);
        System.out.println("Number: " + test5);

        // How to transform a string into a double
        String test6 = "5.5";
        double test7 = Double.parseDouble(test6);
        System.out.println("Double: " + test7);

        int test8 = 5;
        double test9 = test8;
        System.out.println("Double from int: " + test9);
    }
}
