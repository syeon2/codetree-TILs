import java.util.Scanner;

public class Main {

    public static int[] list;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        list = new int[N + 1];

        System.out.print(recur(N));
    }

    public static int recur(int idx) {
        if (idx == 1) return list[idx] = 1;
        else if (idx == 2) return list[idx] = 2;

        if (list[idx] == 0) {
            list[idx] = recur(idx / 3) + recur(idx - 1);
        }
    
        return list[idx];
    }
}