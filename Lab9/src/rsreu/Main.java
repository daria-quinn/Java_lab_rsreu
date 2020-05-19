package rsreu;



import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        KitchenAppliances microwave1 = new KitchenAppliances(567, "LG", 1240, "15l", "есть", 675, false, false, false);
        KitchenAppliances microwave2 = new KitchenAppliances(567, "LG", 200, "15l", "есть", 675, false, false, false);
        KitchenAppliances microwave3 = new KitchenAppliances(567, "LG", 1300, "15l", "есть", 675, false, false, false);
        PK notebook2 = new PK(56, "HP", 1001, "no", "no", 67, true,true, "touch");
        List<Integer> list = Arrays.asList(microwave1.getCount(), microwave2.getCount(), microwave3.getCount(), notebook2.getCount());
        System.out.println("Колличество товара на складе больше 1000");
        counted(list, (n) -> n > 1000);
    }


    public static int counted(List<Integer> list, Predicate<Integer> predicate) {
        int result = 0;
        for (Integer n : list) {
            if (predicate.test(n)) {
            result++;
            }
        }
        System.out.println(result);
        return result;
    }
}
