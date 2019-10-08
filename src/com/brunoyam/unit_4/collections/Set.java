package com.brunoyam.unit_4.collections;

import com.brunoyam.unit_4.entities.Employee;

public class Set {
    private Employee[] values = new Employee[10];

    public void add(Employee value) {
        //Добавляет переданное значение в масив values. Если массив уже полный, создает массив
        // большего размера и переносит в него все значения.
    }

    public boolean contains(Employee value) {
        //Проверяет есть ли значение value в массиве values и, если уже есть, возвращает true, иначе false.
        return false; //Перед выполнением удалите это строку
    }

    public Employee[] getAll() {
        //Возвращает все значения хранящиеся в values
        return new Employee[0]; //Перед выполнением удалите это строку
    }

}
