import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer[][] list = new Integer[N][3];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[i][0] = x;
            list[i][1] = y;
            list[i][2] = i + 1;
        }

        Arrays.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] a, Integer[] b) {
                return (Math.abs(a[0]) + Math.abs(a[1])) - (Math.abs(b[0]) + Math.abs(b[1]));
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(list[i][2]);
        }
    }
}