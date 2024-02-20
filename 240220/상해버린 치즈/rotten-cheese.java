import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        // N의 idx : 사람 번호, 101은 초(t), 각 값은 치즈 번호
        int[][] personEatTimeACheese = new int[N + 1][101];

        // 먹었는지 확인하는 사람 먹었으면 true
        boolean[] people = new boolean[N + 1];

        // 상한 치즈인지 확인 상했으면 true
        boolean[] cheeses = new boolean[M + 1];

        for (int d = 0; d < D; d++) {
            int pers = sc.nextInt();
            int chee = sc.nextInt();
            int sec = sc.nextInt();

            personEatTimeACheese[pers][sec] = chee;
        }

        for (int s = 0; s < S; s++) {
            int pers = sc.nextInt();
            int illTime = sc.nextInt();

            for (int i = 1; i < illTime; i++) {
                if (personEatTimeACheese[pers][i] > 0) {
                    int badChee = personEatTimeACheese[pers][i];

                    cheeses[badChee] = true;
                }
            }
        }

        for (int c = 1; c <= M; c++) {
            if (cheeses[c]) {

                for (int n = 1; n <= N; n++) {
                    for (int t = 1; t <= 100; t++) {
                        if (personEatTimeACheese[n][t] == c) {
                            people[n] = true;
                        }
                    }
                }
            }
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (people[i]) cnt++;
        }

        System.out.print(cnt);
    }
}