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

        int len = arr.length;

        quickSort(arr, 0, len - 1);

        for (int num : arr) {
            System.out.printf("%d ", num);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pos = partition(arr, low, high);

            quickSort(arr, low, pos - 1);
            quickSort(arr, pos + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int point = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                point += 1;

                int temp = arr[i];
                arr[i] = arr[point];
                arr[point] = temp;
            }
        }

        int temp = arr[point + 1];
        arr[point + 1] = arr[high];
        arr[high] = temp;

        return point + 1;
    }
}