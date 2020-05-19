package ru.rgrtu;

// Демонстрация класса обобщения
public class Main {

    public static void main(String[] args) {
	// Создание экземпляра класса Gen с типом Integer
        Gen<Integer> iOb;

        // Создание экземпляра класса Gen
        // с типом Integer и значением 88
        iOb = new Gen<Integer>(88);

        // Показать тип iOb
        iOb.showType();

        // Получить значение iOb
        int v = iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        // Создание экземпляра класса Gen с типом String
        Gen<String> strOb = new Gen<String>("Generics test");

        // Показать тип strOb
        strOb.showType();

        // Получить значение strOb
        String str = strOb.getob();
        System.out.println("value: " + str);
    }
}
