import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int clazz = 0;
        int clazzCnt = 0;

        int corridor = 0;
        int corridorCnt = 0;

        int bathroom = 0;
        int bathroomCnt = 0;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            clazzCnt++;
            corridorCnt++;
            bathroomCnt++;

            boolean flag = false;

            if (bathroomCnt == 12) {
                bathroom++;
                bathroomCnt = 0;
                flag = true;
            }

            if (!flag && corridorCnt == 3) {
                corridor++;
                corridorCnt = 0;
                flag = true;
            } else if (flag && corridorCnt == 3) corridorCnt = 0;

            if (!flag && clazzCnt == 2) {
                clazz++;
                clazzCnt = 0;
            } else if (flag && clazzCnt == 2) clazzCnt = 0;
        }

        System.out.printf("%d %d %d", clazz, corridor, bathroom);
    }
}