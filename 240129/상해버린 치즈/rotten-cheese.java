import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        int S = sc.nextInt();

        int[][] recordEatingCheese = new int[D][3];

        for (int i = 0; i < D; i++) {
            int p = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();

            recordEatingCheese[i][0] = p;
            recordEatingCheese[i][1] = m;
            recordEatingCheese[i][2] = t;
        }

        int[][] recordSickPerson = new int[S][2];

        for (int i = 0; i < S; i++) {
            int p = sc.nextInt();
            int t = sc.nextInt();

            recordSickPerson[i][0] = p;
            recordSickPerson[i][1] = t;
        }

        int[][] cheeses = new int[M + 1][101];

        for (int a = 0; a < S; a++) {
            int sickPerson = recordSickPerson[a][0];
            int sickTime = recordSickPerson[a][1];

            for (int b = 0; b < recordEatingCheese.length; b++) {
                int eatingPerson = recordEatingCheese[b][0];
                int eatenCheese = recordEatingCheese[b][1];
                int eatingTime = recordEatingCheese[b][2];

                if (eatingPerson == sickPerson && sickTime > eatingTime) {
                    for (int c = eatingTime; c < sickTime; c++) {
                        cheeses[eatenCheese][c] = 1;
                    }
                }
            }
        }

        int[] people = new int[N + 1];

        for (int i = 0; i < recordEatingCheese.length; i++) {
            int person = recordEatingCheese[i][0];
            int cheese = recordEatingCheese[i][1];
            int time = recordEatingCheese[i][2];

            for (int k = 1; k <= time; k++) {
                if (cheeses[cheese][k] == 1) {
                    people[person] = 1;
                }
            }
        }

        int cnt = 0;

        for (int i = 1; i < people.length; i++) {
            if (people[i] == 1) cnt++;
        }

        System.out.print(cnt);
    }
}