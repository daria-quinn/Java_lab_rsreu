package rsreu;
import java.util.Scanner;

public class Transport
{
   public String time;
   private int time;

   private Transport(int time){
      this.time = time;
   }

   private Transport() {

   }

   public void setTime() {
      Scanner in = new Scanner(System.in);

      System.out.printf("Введите time перевозки пассажира: " );
      time = in.nextInt();
      in.close();
   }
}
