import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] listA = new int[N];
        int[] listB = new int[M];

        for (int i = 0; i < N; i++) {
            listA[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            listB[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i <= N - M; i++) {

            int[] temp = copyArray(listB);

            for (int k = i; k < i + M; k++) {

                for (int j = 0; j < temp.length; j++) {
                    if (listA[k] == temp[j]) {
                        temp[j] = 0;
                        break;
                    }
                }
            }

            boolean flag = true;

            for (int k = 0; k < temp.length; k++) {
                if (temp[k] != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) ans++;
        }

        System.out.print(ans);
    }

    public static int[] copyArray(int[] list) {
        int[] temp = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }

        return temp;
    }
}