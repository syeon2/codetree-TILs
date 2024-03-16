import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDigit = getMaxDigit(arr);

        for (int i = 1; i <= maxDigit; i++) {
            int pos = (int) Math.pow(10, i);

            List<List<Integer>> list = new ArrayList<>();

            for (int k = 0; k < 10; k++) {
                list.add(new LinkedList<>());
            }

            for (int value : arr) {
                int digit = (value % pos) / (pos / 10);
                list.get(digit).add(value);
            }

            int[] newArr = new int[N];
            int idx = 0;

            for (int k = 0; k < 10; k++) {
                List<Integer> posList = list.get(k);

                while (!posList.isEmpty()) {
                    newArr[idx++] = posList.remove(0);
                }
            }

            arr = newArr;
        }

        for (int value : arr) {
            System.out.printf("%d ", value);
        }
    }

    public static int getMaxDigit(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int cnt = 0;

            while (num > 0) {
                num /= 10;
                cnt++;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}