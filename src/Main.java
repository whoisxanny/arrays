public class Main {
    public static void main(String[] args) {
        int[] weights = {90, 93, 95, 99, 93, 95, 91, 94, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        int january = 0;
        System.out.println(january);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }

    }
}