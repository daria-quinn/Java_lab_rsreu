package ru.rgrtu;

// Это пример класса обобщения. Т - это переменная типа,
// которая при использовании в Main будет заменена на реальный тип
public class Gen<T> {
    T ob; // объявление экземпляра класса типа Т

    // Конструктор ссылается
    // на экземпляр класса типа Т
    Gen(T o) {
        ob = o;
    }

    // Вернуть ob
    T getob() {
        return ob;
    }

    // Показать тип T
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
