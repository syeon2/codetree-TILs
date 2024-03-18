import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        heapSort(arr, N);

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void heapSort(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, n, i);
        }

        for (int i = n; i > 1; i--) {
            swap(arr, i, 1);
            heapify(arr, i - 1, 1);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = i * 2;
        int right = (i * 2) + 1;

        if (left <= n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right <= n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    public static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}