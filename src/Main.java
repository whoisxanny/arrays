import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = new int[] {1, 2, 3};
        double[] arrayTwo = {1.57, 7.654, 9.986};
        int[] ills = {1, 2, 3, 4 ,5 , 6};

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(ills));

        for (int i = arrayOne.length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.print(arrayTwo[i] + " ");
        }
        System.out.println();
        for (int i = ills.length - 1; i >= 0; i--) {
            System.out.print(ills[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 != 0) {
                arrayOne[i] = arrayOne[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayOne));


    }
}