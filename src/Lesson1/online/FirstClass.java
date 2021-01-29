
package Lesson1.online;

public class FirstClass {
    // точка входа. публичный, статичный(метод относится к объектно ориентированному программированию, void - тип метода, значит ничто, чтото делает но ничего не возвращает. main -название метода, должно быть одно, означает что данный метод является ключевой точкой откуда программа начнет свое исполнение. В скобочках  - аргументы, квадратные это массив, стринг это тип переменной. args - аргументы. )
    public static void main(String[] args){

          System.out.println("\tHello\t\tjava!");
        System.out.println("Привет, Мир!");

        //целочисленные
        byte myByte = 50; //-128..127 (1byte)
        short myShort = 500; // -32768..32767 (2byte)
        int myInt = 50000; // -2.1*10^9..2.1*10^9 (4byte)
        long myLong = 3000000000L; // -2^63..2^64 (8byte)

        //плавающая точка
        float myFloat = 15.5f; //(4byte) 0.0000000
        double myDouble = 15.5; //(8byte) 0.00000000000000

        float result = 10 / (float)3.1;
        System.out.println(result);

        //символы
        char myChar = 'T';
        char testChar = 84; // ASCII, UTF

        System.out.println(testChar);
        System.out.println((byte) myChar);

        //булева переменная
        boolean myBoolean = false; //true

       // String myString = "Hello World";

        //+-*/

        int a = 64;
        float b = 48;
        float c = a / b; //(чтобы в результате получилась плавающая точка, один из типов переменных а или b должны быть так же float )
        System.out.println(c);

        int d = 15 % 3;
        System.out.println(d);

        int f = 5;
        f = f + 1;
        f += 109;

        int r = 5;
        System.out.println("Мое число r = " + r + " конкатенация");
       r++; // r = r + 1
        System.out.println(r);

        /* int age = 65;
//if (если) else (иначе)
        if (age > 65) {
            System.out.println(" Извини, старик");
        } else if (age > 18 ) {
            System.out.println("Покупка удалась");
        } else  {
            System.out.println("Покупка не удалась");
        }*/
int age  = 17;

        if (age < 18 ) {
            System.out.println("Покупка не удалась");
        } else if (age > 65) {
            System.out.println(" Извини, старик");
        } else {
            System.out.println("Покупка удалась");
        }
// МЕТОДЫ

        int a1 = 100;
        int a2 = 67;


        System.out.println(a1 + a2);
        myMath (a1, a2);
        int fff = myMath(a1, a2);
        System.out.println(myMath(50, 48));
        a1++;
        System.out.println(a1 + a2);
        myMath (a1, a2);
        a2++;
        System.out.println(a1 + a2);
        myMath (a1, a2);
        a1++;
        System.out.println(a1 + a2);
        myMath (a1, a2);


       doSomething( "STRING!!!",159, 15.9f );

    }

    public static void doSomething(String myString, int abc, float qwe ) {
        System.out.println(myString);
        System.out.println(abc + qwe);
        System.out.println("1234567");
    }

    public static int myMath(int value1, int value2) {
        return value1 + value2;
    }

}
