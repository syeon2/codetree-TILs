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

        int low = 0;
        int high = N - 1;

        mergeSort(arr, low, high);

        for (int num : arr) {
            System.out.printf("%d ", num);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] mergedArr = new int[arr.length];

        int x1 = low;
        int x2 = mid + 1;

        int idx = low;
        while (x1 <= mid && x2 <= high) {
            if (arr[x1] < arr[x2]) mergedArr[idx++] = arr[x1++];
            else mergedArr[idx++] = arr[x2++];
        }

        while (x1 <= mid) {
            mergedArr[idx++] = arr[x1++];
        }

        while (x2 <= high) {
            mergedArr[idx++] = arr[x2++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = mergedArr[i];
        }
    }
}