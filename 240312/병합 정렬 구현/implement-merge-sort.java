import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }

        merge_sort(list, 0, N - 1);

        for (int i = 0; i < N; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void merge_sort(int[] list, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            merge_sort(list, start, middle);
            merge_sort(list, middle + 1, end);
            merge(list, start, middle, end);
        }
    }

    public static void merge(int[] list, int start, int middle, int end) {
        int[] newList = new int[end - start + 1];

        int i = start;
        int j = middle + 1;

        int idx = 0;

        while (i <= middle && j <= end) {
            if (list[i] > list[j]) {
                newList[idx] = list[j];
                j++;
                idx++;
            } else {
                newList[idx] = list[i];
                i++;
                idx++;
            }
        }

        while (i <= middle) {
            newList[idx++] = list[i++];
        }

        while (j <= end) {
            newList[idx++] = list[j++];
        }

        for (int x = start; x <= end; x++) {
            list[x] = newList[x - start];
        }
    }
}