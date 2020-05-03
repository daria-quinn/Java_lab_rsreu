package rsreu;

public  class AbstractFactoryTest {

    public static void main(String[] args) {
        String country = "CHN";
        InteAbsFactory ifactory = null;
        if(country.equals("UA")) {
            ifactory = new UaNotebookPriceAbsFactory();
        } else if(country.equals("CHN")) {
            ifactory = new AbsFactory();
        }
        Apple apple = ifactory.getApple();
        System.out.println(apple.getApplePrice());
    }
}
