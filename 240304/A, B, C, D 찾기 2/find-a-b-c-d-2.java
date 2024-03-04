import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = 15;
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int ansA = 0;
        int ansB = 0;
        int ansC = 0;
        int ansD = 0;

        for (int a = 0; a < N; a++) {

            for (int b = 0; b < N; b++) {
                if (a == b) continue;

                for (int c = 0; c < N; c++) {
                    if (a == c || b == c) continue;

                    for (int d = 0; d < N; d++) {
                        if (a == d || b == d || c == d) continue;

                        int[] copy = new int[N];
                        for (int x = 0; x < N; x++) {
                            copy[x] = list[x];
                        }

                        boolean flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[a] + list[b]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[b] + list[c]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[c] + list[d]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[d] + list[a]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[a] + list[c]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[b] + list[d]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[a] + list[b] + list[c]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[a] + list[b] + list[d]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[a] + list[c] + list[d]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[b] + list[c] + list[d]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;
                        flag = false;

                        for (int x = 0; x < N; x++) {
                            if (copy[x] == list[a] + list[b] + list[c] + list[c]) {
                                flag = true;
                                copy[x] = 0;
                                break;
                            }
                        }

                        if (!flag) break;

                        if (flag) {
                            ansA = list[a];
                            ansB = list[b];
                            ansC = list[c];
                            ansD = list[d];
                        }
                    }
                }
            }
        }

        int[] ans = {ansA, ansB, ansC, ansD};
        Arrays.sort(ans);

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d ", ans[i]);
        }
    }
}