import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] list = new int[15];
        for (int i = 0; i < 15; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ansA = 0;
        int ansB = 0;
        int ansC = 0;
        int ansD = 0;

        for (int i = 0; i < 15; i++) {
            for (int k = i + 1; k < 15; k++) {
                for (int j = k + 1; j < 15; j++) {
                    for (int l = j + 1; l < 15; l++) {

                        int[] copy = new int[15];
                        for (int x = 0; x < 15; x++) {
                            copy[x] = list[x];
                        }

                        int a = copy[i];
                        int b = copy[k];
                        int c = copy[j];
                        int d = copy[l];

                        copy[i] = 0;
                        copy[k] = 0;
                        copy[j] = 0;
                        copy[l] = 0;

                        for (int x = 0; x < 15; x++) {
                            // a + b
                            if (isSame(list, x, a + b)) {
                                copy[x] = 0;
                            }

                            // b + c
                            if (isSame(list, x, b + c)) {
                                copy[x] = 0;
                            }

                            // c + d
                            if (isSame(list, x, c + d)) {
                                copy[x] = 0;
                            }

                            // d + a
                            if (isSame(list, x, d + a)) {
                                copy[x] = 0;
                            }

                            // a + c
                            if (isSame(list, x, a + c)) {
                                copy[x] = 0;
                            }

                            // b + d
                            if (isSame(list, x, b + d)) {
                                copy[x] = 0;
                            }

                            // a + b + c
                            if (isSame(list, x, a + b + c)) {
                                copy[x] = 0;
                            }

                            // a + b + d
                            if (isSame(list, x, a + b + d)) {
                                copy[x] = 0;
                            }

                            // a + c + d
                            if (isSame(list, x, a + c + d)) {
                                copy[x] = 0;
                            }

                            // b + c + d
                            if (isSame(list, x, b + c + d)) {
                                copy[x] = 0;
                            }

                            // a + b + c + d
                            if (isSame(list, x, a + b + c + d)) {
                                copy[x] = 0;
                            }
                        }

                        boolean flag = true;
                        for (int x = 0; x < 15; x++) {
                            if (copy[x] != 0) flag = false;
                        }

                        if (flag) {
                            ansA = list[i];
                            ansB = list[k];
                            ansC = list[j];
                            ansD = list[l];
                        }
                    }
                }
            }
        }

        System.out.printf("%d %d %d %d", ansA, ansB, ansC, ansD);
    }

    public static boolean isSame(int[] list, int idx, int num) {
        if (list[idx] == num) return true;

        return false;
    }
}