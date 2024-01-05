public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        for (int i = 1; i <= 19; i++) {

            for (int k = 1; k <= 19; k++) {
                System.out.printf("%d * %d = %d", i, k, i * k);

                if (k == 19 || k % 2 == 0) System.out.println();
                else System.out.print(" / ");
            }
        }
    }
}