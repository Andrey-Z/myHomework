package Lesson1.online;

public class HomeWork1 {
    public static void main(String[] agrs) {

        int a = 3;
        int b = 5;
        int c = 7;
        int d = 9;

        System.out.println(first(a, b, c, d));
        System.out.println(second(a, b));
        first(3, 5, 7, 9);
        second(7, 9);
        third(13);
        fouth("Андрей");

    }

// 1) Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;

    public static double first(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // 2) Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
    // от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

    public static boolean second(int a, int b) {
        int s = a + b;
        if (s >= 10) {
            return true;
        } else if (s <= 20) {
            return true;
        } else {
            return false;
        }
    }
}

        //3) Написать метод, которому в качестве параметра передается целое число, метод должен проверить
        // положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
        // Результат работы метода вывести в консоль
        public static boolean third(int a) {
            if (a >= 0)
                return true;
        else {
        return false;
        }
}

//4) Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод
// должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.

public static void fouth(String name){
    System.out.println("Привет, " + name + "!");
}
}
























