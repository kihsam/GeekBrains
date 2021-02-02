package ru.geekbrains.lesson1;

public class FirstApp {
    public static void main(String[] args) {

        // =====================  1 task =====================
        System.out.println(" =======  1 task ====== " );
        System.out.println(" Hello, WOrld!" );


        // =====================  2 task =====================
        byte bb = 127;
        short sh = 32000;
        int in = 2000000;
        long lo = 2000000L;
        float fl = 12.334f;
        double dd = -23232.323232;
        char ch1 = 'y';
        char ch2 = 132;
        boolean bo = true;

        System.out.println();
        System.out.println(" =======  2 task ====== " );
        System.out.println(" byte bb = " + bb);
        System.out.println(" short sh = " + sh);
        System.out.println(" int in = " + in);
        System.out.println(" long lo = " + lo);
        System.out.println(" float fl = " + fl);
        System.out.println(" double dd = " + dd);
        System.out.println(" char ch1 " + ch1);
        System.out.println(" char ch2 " + ch2);
        System.out.println(" boolean bo = " + bo);

        // =====================  3 task =====================

        System.out.println();
        System.out.println(" =======  3 task ====== " );
        System.out.println(" result a * (b + c / d) = " + exmp(10,20,50,2));

        // =====================  4 task =====================
        System.out.println();
        System.out.println(" =======  4 task ====== " );
        System.out.println(" result  10 <= SUM <= 20 : " + ifSum( 10, 1));

        // =====================  5 task =====================
        System.out.println();
        System.out.println(" =======  5 task ====== " );
        positiveOrNegative( -5);
        positiveOrNegative(120);
        positiveOrNegative(0);

        // =====================  6 task =====================
        System.out.println();
        System.out.println(" =======  6 task ====== " );
        System.out.println(" Result = " + numberPositOrNegat(-1));
        System.out.println(" Result = " + numberPositOrNegat(0));
        System.out.println(" Result = " + numberPositOrNegat(1));

        // =====================  7 task =====================
        System.out.println();
        System.out.println(" =======  7 task ====== " );
        helloName("Федя");

        // =====================  8 task =====================
        System.out.println();
        System.out.println(" =======  8 task ====== " );
        int year = 2020;
        System.out.println(year + " год высокостный? Result= " + leapYear(year));
        year = 2100;
        System.out.println(year + " год высокостный? Result= " + leapYear(year));
        year = 2400;
        System.out.println(year + " год высокостный? Result= " + leapYear(year));

    }

    // =====================  3 task =====================
    public static float exmp(float a, float b, float c, float d){
        return a * (b + c / d);
    }

    // =====================  4 task =====================
    public static boolean ifSum( int a, int b){
        return a + b >= 10 & a + b <= 20;
    }

    // =====================  5 task =====================
    public static void positiveOrNegative (int a){
       if (a >= 0) System.out.println( a + " = number positive");
       else System.out.println( a + " = number negative" );
    }

    // =====================  6 task =====================
    public static boolean numberPositOrNegat( int a){
        return a<0;
    }

    // =====================  7 task =====================
    public static void helloName ( String name){
        System.out.println("Привет, " + name + "!");
    }

    // =====================  8 task =====================
    public  static boolean leapYear (int year){
        return year % 4 == 0 & year % 100 !=0 | year % 400 == 0;
    }

}
