package rsreu;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("введите размер массива");
        int l = in.nextInt();
        int[] arr = new int[l];
        System.out.println("введите масив");

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = in.nextInt();
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + "");
        }

        System.out.println();

        for(i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                System.out.print(" чётные " + arr[i]);
            } else {
                System.out.print(" нечётные " + arr[i]);
            }
        }

    }
}

