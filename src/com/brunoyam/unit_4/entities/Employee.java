package com.brunoyam.unit_4.entities;


// Добавьте приватные поля, коструктор и публичные методы для доступа к полям (геттеры и сеттеры)
public class Employee {

    private String name;

    // Добавьте поля surname, secondName, phone

    Employee() {}

    // Добавьте конструктор с параметрами name, surname, secondName.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Добавьте геттеры и сеттеры для новых полей

    /*Уровень 3:
    Переопределите метод toString() так, чтобы он возвращал полное имя сотрудника (Имя Фамилия Отчество)

     */
}
