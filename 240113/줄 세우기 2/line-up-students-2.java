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
            public int compare(Integer[] list1, Integer[] list2) {
                if (list1[0] == list2[0]) {
                    if (list1[1] == list2[1]) {
                        return list1[2] - list2[2];
                    }

                    return list2[1] - list1[1];
                }

                return list1[0] - list2[0];
            }
        });

        for (int i = 0; i < N; i++) {
            Integer[] a = list[i];

            System.out.printf("%d %d %d\n", a[0], a[1], a[2]);
        }
    }
}