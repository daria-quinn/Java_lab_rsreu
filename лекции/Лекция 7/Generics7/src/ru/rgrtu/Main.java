package ru.rgrtu;

// Деонстрация класса не обобщения
public class Main {

    public static void main(String[] args) {
	NonGen iOb;

	// Присваивание экземпляра класса NonGen значения 88
        iOb = new NonGen(88);

        // Показать тип iOb
        iOb.showType();

        // Вывести значение iOb
        int v = (Integer) iOb.getob();
        System.out.println("value: " + v);

        System.out.println();

        // Создание экземпляра класса NonGen типа String
        NonGen strOb = new NonGen("Non-Generics Test");

        // Показать тип strOb
        strOb.showType();

        // Вывести значение strOb
        String str = (String) strOb.getob();
        System.out.println("value: " + str);

        // Присваиваем экземпляры друг другу.
        // Это нарушение безопасности, но разрешается
        iOb = strOb;
        // Ошибка во время выполнения
        v = (Integer) iOb.getob();
    }
}
