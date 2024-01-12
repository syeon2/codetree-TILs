import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[][] list = new Integer[N][3];

        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();

            list[i][0] = height;
            list[i][1] = weight;
            list[i][2] = i + 1;
        }

        Arrays.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                if (a[0] == b[0]) {
                    if (a[1] == b[1]) return b[1] - a[1];
                }

                return a[0] - b[0];
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.printf("%d %d %d\n", list[i][0], list[i][1], list[i][2]);
        }
    }
}