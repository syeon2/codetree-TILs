import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] pigeon = new int[11];
        Arrays.fill(pigeon, -1);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            int direc = sc.nextInt();

            if (pigeon[p] == -1) pigeon[p] = direc;
            else {
                if (pigeon[p] != direc) {
                    cnt++;
                    pigeon[p] = direc;
                }
            }
        }

        System.out.print(cnt);
    }
}