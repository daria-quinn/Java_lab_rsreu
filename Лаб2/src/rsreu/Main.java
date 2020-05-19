package rsreu;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car car1 = new Car();
        Bicycle bicycle1 = new Bicycle();
        car1.setTime();
        bicycle1.setTime();
        System.out.println("Time of car number one "+ car1.time);
        System.out.println("Time of car number one " + bicycle1.time);


    }
}
