package com.brunoyam.unit_4.training;

public class LevelOneTraining {


    public static void variables() {
        //Объявляем переменную типа int
        int myIntegerVariable;
        //Инициализируем переменную myIntegerVariable
        myIntegerVariable = 12;
        //Выводим значение переменной myIntegerVariable в консоль
        System.out.println(myIntegerVariable);

        //По аналогии создайте переменные всех примитивных типов, инициализируйте любым значением и выведите в консоль.
    }

    public static void arrays() {
        //Объявили переменную типа массив целых чисел
        int[] array;
        //Создали массив и "положили в переменную"
        array  = new int[5];

        //Заполняем массив значениями.
        array[0] = 15;
        array[1] = 20;
        array[2] = 25;
        array[3] = 30;
        array[4] = 35;

        //По аналогии создайте массив строк и заполните именами.

    }

    public static void forLoop() {
        //Объявили переменную типа массив целых чисел
        int[] array;
        //Создали массив и "положили в переменную"
        array  = new int[10];

        // Обходим массив присваивая всем элементам значения от 0, до 9
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //Выводим все значения масива в консоль.
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Выводим все значения массива в консоль в обратном порядке
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println();
        }
    }

    public static void  whileLoop() {

        //Объявили переменную типа массив целых чисел
        int[] array;
        //Создали массив и "положили в переменную"
        array  = new int[10];

        // Обходим массив присваивая всем элементам значения от 0, до 9
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        //Объявляем переменную-счетчик и присваиваем ей значение 0
        int iter = 0;

        //Используя цикл while выведем в консоль первую половину массива
        while(iter < array.length / 2) { //Пока iter меньше половины длины массива
            System.out.println(array[iter]); //Выводим в консоль
        }

        //По аналогии, используя цикл while, выведите в консоль вторую половину массива

    }

}
