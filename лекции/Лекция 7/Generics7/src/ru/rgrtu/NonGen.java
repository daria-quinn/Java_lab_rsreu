package ru.rgrtu;

// Класс по функционалу как обобщение, но не использующий обобщение
public class NonGen {
    Object ob; // экземпляр ob типа Object

    // Конструктор с параметром типа Object
    NonGen(Object o) {
        ob = o;
    }

    // Возвращаем тип Object
    Object getob() {
        return ob;
    }

    // Показать тип ob
    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}
