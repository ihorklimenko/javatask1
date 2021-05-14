package com.company;
import java.util.Random;
import java.util.Scanner;

/*      1. Приветствовать любого пользователя при вводе его имени через командную строку.
        2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.


        6.Ввести с консоли n целых чисел. На консоль вывести:
        6.1. Четные и нечетные числа.
        6.2. Наибольшее и наименьшее число.
        6.3. Числа, которые делятся на 3 или на 9.
        6.4. Числа, которые делятся на 5 и на 7.
        6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых
        цифр.
        6.6. «Счастливые» числа.*/

public class Main {

    public static void main(String[] args) {
    //1.
//	Scanner scan_Name = new Scanner(System.in);
//        System.out.println("hi what is your name?");
//        String name = scan_Name.nextLine();
//        System.out.println("hello  "+name);
//        System.out.println("______________");
//    //2.
//        Scanner scan_Reverse = new Scanner(System.in);
//        String reverse = scan_Reverse.nextLine();
//        String reversedString = new StringBuffer(reverse).reverse().toString();
//        System.out.println(reverse);
//        System.out.println(reversedString);
//    //3.
//        Random rnd = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int Numb = scanner.nextInt();
//        int mass[] = new int[Numb];
//        for(int i = 0;i<Numb; i++)
//        {
//            mass[i]=rnd.nextInt();
//            System.out.println(mass[i]);
//        }
//
//    //4.
//        Scanner scan_password = new Scanner(System.in);
//        System.out.println("Enter password:");
//        String password = scan_password.next();
//        String password_default = "12341234";
//        if(password.equals(password_default))
//            System.out.println("Password ok");
//        else System.out.println("Password wrong");
    //5.
//        Scanner scan = new Scanner(System.in);
//            int x = scan.nextInt();
//            int y = scan.nextInt();
//            System.out.println("Сумма= " + (x + y));
//            System.out.println("Произведение= " + (x * y));
    //6.
//        System.out.println("Введите количество чисел:");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] Numbers = new int[size];
//        System.out.println("Введите сами числе через пробел");
//        for (int i = 0; i<size;i++){
//            Numbers[i] = scanner.nextInt();
//        }
//        for (int i=0;i<size;i++)
//            if (Numbers[i]%2 != 0) //Нечётные числа
//                System.out.println("Нечётное" + Numbers[i]);
//
//            else if (Numbers[i] %2 == 0) //Чётные числа
//                System.out.println("Чётное" + Numbers[i]);
//
//            int min = Numbers[0]; // Минимальное число
//            for (int i = 0; i<size; i++){
//                if (min > Numbers[i])
//                    min = Numbers[i];
//            }
//        System.out.println(" Минимум " + min);
//
//            int max = Numbers[0]; // Максимальное число
//            for(int i=0;i<size;i++){
//                if (max < Numbers[i])
//                    max = Numbers[i];
//                }
//        System.out.println(" Максимум " + max);
//
//        for (int i = 0; i < size; i++) // Числа что делятся на 3 ИЛИ 9
//            if ((Numbers[i] % 3 == 0) || (Numbers[i] % 9 == 0))
//                System.out.println("Число делящееся на 3 ИЛИ 9: " + Numbers[i]);
//
//        for (int i = 0; i < size; i++) // Числа что делятся на 5 И 7
//            if ((Numbers[i] % 5 == 0) && (Numbers[i] % 7 == 0))
//                System.out.println("Число делящееся на 5 И 7: " + Numbers[i]);
//
//        int a = 0, b = 0, c = 0;   //3х значное число без одинаковых цифр
//        for (int j = 0; j < size; j++)
//            if ((Numbers[j] > 99) && (Numbers[j] < 1000)) {
//                a = Numbers[j] / 10 / 10;
//                b = Numbers[j] / 10 % 10;
//                c = Numbers[j] % 100 % 10;
//                if (a != b && a != c && b != a && b != c && c != a && c != b)
//                    System.out.println("3х значное без одинаковых цифр: " + Numbers[j]);
//            }
    }

}
