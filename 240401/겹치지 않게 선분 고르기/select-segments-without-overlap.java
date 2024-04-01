import java.util.*;

public class Main {

    public static List<Line> list = new ArrayList<>();
    public static List<Line> ansList = new ArrayList<>();

    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            list.add(new Line(x1, x2));
        }

        list.sort((a, b) -> a.x2 - b.x2);

        permutation(0);

        System.out.print(ans);
    }

    public static void permutation(int idx) {
        if (idx == list.size()) {
            ans = Math.max(ans, ansList.size());

            return;
        }

        for (int i = idx; i < list.size(); i++) {
            if (ansList.isEmpty()) {
                ansList.add(list.get(i));
                permutation(idx + 1);
                ansList.remove(0);
            } else {
                Line last = ansList.get(ansList.size() - 1);
                Line curLine = list.get(i);

                if (last.x2 < curLine.x1) {
                    ansList.add(curLine);
                    permutation(idx + 1);
                    ansList.remove(ansList.size() - 1);
                }
            }

        }
    }

    public static class Line {
        public int x1;
        public int x2;

        public Line(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }
    }
}