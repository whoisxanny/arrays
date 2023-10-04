public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Summa zatrat za mesyac ravna " + sum + " rubley");



        int max = -1;
        for (int current : arr) {
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Maksimal'naya summa zatrat za den' ravna " + max + " rubley");

        int min = 200000;
        for (int current2 : arr) {
            if (current2 < min) {
                min = current2;
            }
        }
        System.out.println("Minimal'naya summa zatrat za den' ravna " + min + " rubley");



        int srednyaya = sum / 30;
        System.out.println("Srednyaya summa zatrat za mesyac sostavila " + srednyaya + " rubley");





    }

}