import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int k = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());

            k = Math.max(k, String.valueOf(list.get(i)).length());
        }

        for (int i = k - 1; k >= 0; k--) {
            List<List<Integer>> arr = new ArrayList<>();

            for (int l = 0; l < 10; l++) {
                arr.add(new ArrayList<>());
            }

            for (int l = 0; l < list.size(); l++) {
                int digit = getDigit(list.get(l), i);
                arr.get(digit).add(list.get(l));
            }

            List<Integer> storedArr = new ArrayList<>();
            for (int l = 0; l < 10; l++) {
                for (int j = 0; j < arr.get(l).size(); j++) {
                    storedArr.add(arr.get(l).get(j));
                }
            }

            list = storedArr;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.print(sb);
    }

    public static int getDigit(int num, int pos) {
        return (num / (int) Math.pow(10, pos)) % 10;
    }
}