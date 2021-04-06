import java.text.DecimalFormat;
import java.util.Scanner;

public class Tasks {
    public static void unit1Tasks() {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
    }

    private static void task1() {
        System.out.println(" Найдите значение функции z = ((a-3) * b/2)+c");
        int z;
        int a = 4;
        int b = 4;
        int c = 4;
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
        System.out.println();
    }

    private static void task2() {
        System.out.println("задание 2");
        double a = 2.0;
        double b = 4.0;
        double c = 6.0;
        double z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);
        System.out.println();
    }

    private static void task3() {
        System.out.println("задание 3");
        double x = 40.0;
        double y = 60.0;
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
        System.out.println();
    }

    private static void task4() {
        System.out.println("задание 4");
        double r = 123.456;
        int firstNumber = (int) r;
        int secondNumber = (int) ((r - firstNumber) * 1000);
        double answer = secondNumber + firstNumber * 0.001;
        System.out.println(r);
        System.out.println(answer);
        System.out.println();
    }

    private static void task5() {
        System.out.println("задание 5");
        int sec = 4051;
        System.out.println("Дано " + sec + " секунд");
        int h = sec / 3600;
        int left = sec - (h * 3600);
        int minutes = left / 60;
        int seconds = left - (minutes * 60);
        System.out.println(String.format("%02d:%02d:%02d", h, minutes, seconds));
        System.out.println();
    }

    private static void task6() {
        System.out.println("задание 6");
        int x = 4;
        int y = -1;
        boolean flag = false;
        if (y <= 4 && y >= 0 && x >= -2 && x <= 2 ||
                y >= -3 && y <= 0 && x >= -4 && x <= 4) {
            flag = true;
        }

        System.out.println(flag);
        System.out.println();
    }

    private static void task7() {
        System.out.println("задание 7");
        int a = 45;
        int b = 45;
        int c = 180 - a - b;
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("Углы треугольника: " + a + "," + b + "," + c);
            if (c == 90) {
                System.out.println("Треугольник прямоугольный");
            }
        } else {
            System.out.println("Такой треугольник не существует");
        }
    }

    private static void task8() {
        System.out.println("задание 8");
        int a = 5;
        int b = 6;
        int c = 4;
        int d = 3;
        int answer = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(answer);
        System.out.println();
    }

    private static void task9() {
        System.out.println("задание 9");
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        int x3 = 3;
        int y3 = 3;
        if ((y1 - y2) * (x1 - x3) == (y1 - y3) * (x1 - x2)) {
            System.out.println("Точки на одной прямой");
        } else {
            System.out.println("Точки не на одной прямой");
        }
        System.out.println();
    }

    private static void task10() {
        System.out.println("задание 10");
        int a = 15;
        int b = 20;
        int x = 8;
        int y = 9;
        int z = 10;
        if (a > x && b > y ||
                a > y && b > x ||
                a > z && b > x ||
                a > z && b > y ||
                a > x && b > z ||
                a > y && b > z) {
            System.out.println("пройдет");
        } else {
            System.out.println("не пройдет");
        }
        System.out.println();
    }

    private static void task11() {
        System.out.println("задание 11");
        int x = 4;
        double sol = 0;

        if (x <= 3) {
            sol = Math.pow(x, 2) - 3 * x - 9;


        }
        if (x > 3) {
            sol = 1 / (Math.pow(x, 3) + 6);

        }
        DecimalFormat formDouble = new DecimalFormat("0.00");
        System.out.println(formDouble.format(sol));
    }

    private static void task12() {
        System.out.println("задание 12");
        Scanner in = new Scanner(System.in);
        int a;
        int sol = 0;
        System.out.println("Введите число");
        a = in.nextInt();
        for (int i = 0; i <= a; i++) {
            sol += i;
        }
        System.out.println(sol);
    }

    private static void task13() {
        System.out.println("задание 13");
        int a = -5;
        int b = 9;
        int h = 3;
        int y;
        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("x = " + i + " y = " + y);
        }
        System.out.println();
    }

    private static void task14() {
        System.out.println("задание 14");
        int sol = 0;
        for (int i = 1; i <= 100; i++) {
            sol += Math.pow(i, 2);
        }
        System.out.println(sol);
        System.out.println();
    }

    private static void task15() {
        System.out.println("задание 15");
        int sol = 1;
        for (int i = 1; i <= 200; i++) {
            sol *= Math.pow(i, 2);
        }
        System.out.println(sol);
        System.out.println();
    }

    private static void task16() {
        System.out.println("задание 16");
        double e = 0.1;
        double sol = 0.0;
        double numb = 0.0;
        int n = 20;
        for (int i = 1; i <= n; i++) {
            sol = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(sol) >= e) {
                numb += sol;
            }
        }
        DecimalFormat formDouble = new DecimalFormat("0.00");
        System.out.println(formDouble.format(numb));
        System.out.println();
    }

    private static void task17() {
        for (int i = 56; i <= 78; i++) {
            System.out.println("i = " + i + " ASCII = " + (char) i);
        }
        System.out.println();
    }

    private static void task18() {
        System.out.println("задание 18");
        int m;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа (начало и конец промежутка соответсвенно): ");
        n = in.nextInt();
        m = in.nextInt();
        while (n > m) {
            System.out.println("Неправильный ввод!");
            n = in.nextInt();
            m = in.nextInt();
        }
        for (int i = n; i <= m; i++) {
            System.out.print("Делители числа " + i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    private static void task19(){
        System.out.println("задание 19");
        int a = 2345;
        int b = 56728;
        int newB =b;
        int numA;
        int numB;
        System.out.println("Число a = "+a+". Число b = "+b+".");
        System.out.print("Одинаковые цифры:");
        do{
            numA = a%10;
            a = a / 10;
            while (b > 0){
                numB = b%10;
                b = b / 10;
                if(numB == numA){
                    System.out.print(" "+numB);
                }
            }
            b = newB;
        }while(a>0);

        System.out.println();
    }
}
