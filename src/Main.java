public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        System.out.println("Задание 1");
        System.out.println();
        //С помощью цикла for выведите в консоль все числа от 1 до 10
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int i = 10; i >= 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println();


        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        //Выведите в консоль все четные числа от 0 до 17.
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 4");
        System.out.println();
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        for (int i = 10; i > -11; i--) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        System.out.println();
        //Напишите программу, которая выводит в консоль все високосные года,
        // начиная с 1904 года до 2096. В консоль результат должен выводиться в формате
        // "… год является високосным"
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Домашнее задание 3");
        System.out.println("Задание 1");
        System.out.println();
        //Посчитайте с помощью цикла for сумму годовых накоплений,
        // если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
        //Выведите сумму накоплений за каждый месяц в консоль в формате:
        // "Месяц … , сумма накоплений равна … рублей" .
        int monthlySum = 29000;
        int total = 0;

        for (int i = 0; i < 12; i++) {
            total = total + monthlySum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        //Перепишите решение задачи выше при условии,
        // что деньги вы откладывать будете не "в банку",
        // а в банк под проценты – 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате:
        // "Месяц … , сумма накоплений равна … рублей"
        for (int i = 0; i < 12; i++) {
            total = total + monthlySum;
            total = total + total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }



    }
}