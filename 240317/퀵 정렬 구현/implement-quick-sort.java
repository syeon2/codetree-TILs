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
        int pivot = selectPivot(arr);

        int point = low;

        for (int i = low; i < high; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, point++);
            }
        }

        swap(arr, point, high);

        return point;
    }

    public static int selectPivot(int[] arr) {
        int idx = arr.length / 2;

        int pivot = arr[idx];

        arr[idx] = arr[arr.length - 1];
        arr[arr.length - 1] = pivot;

        return pivot;
    }

    public static void swap(int[] arr, int x1, int x2) {
        int temp = arr[x1];
        arr[x1] = arr[x2];
        arr[x2] = temp;
    }
}