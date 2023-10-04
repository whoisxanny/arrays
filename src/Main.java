import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = new int[]{1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        int[] ills = {1, 2, 3, 4, 5, 6};


        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]);
            if (i != arrayOne.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i]);
            if (i != arrayTwo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < ills.length; i++) {
            System.out.print(ills[i]);
            if (i != ills.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = arrayOne.length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i]);
            if (i != arrayOne.length - 3) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.print(arrayTwo[i]);
            if (i != arrayTwo.length - 3) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = ills.length - 1; i >= 0; i--) {
            System.out.print(ills[i]);
            if (i != ills.length - 6) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayOne));
    }
}