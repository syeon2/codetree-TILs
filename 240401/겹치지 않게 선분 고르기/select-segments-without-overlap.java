import java.util.*;

public class Main {

    public static List<Line> list = new ArrayList<>();
    public static List<Line> ansList = new ArrayList<>();

    public static int N;
    public static int ans = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        for (int n = 0; n < N; n++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            list.add(new Line(x1, x2));
        }

        permutation(0);

        System.out.print(ans);
    }

    public static int getAnswer() {
        for (int i = 0; i < ansList.size(); i++) {
            int x1 = ansList.get(i).x1;
            int x2 = ansList.get(i).x2;

            for (int k = i + 1; k < ansList.size(); k++) {
                int x3 = ansList.get(k).x1;
                int x4 = ansList.get(k).x2;

                if ((x1 <= x3 && x2 >= x3) || (x3 <= x1 && x4 >= x1) || 
                    (x1 <= x3 && x2 >= x4) || (x3 <= x1 && x4 >= x2)) {
                        return 0;
                    }
            }
        }

        return ansList.size();
    }

    public static void permutation(int idx) {
        if (idx == N) {
            ans = Math.max(ans, getAnswer());

            return;
        }

        ansList.add(list.get(idx));
        permutation(idx + 1);
        ansList.remove(ansList.size() - 1);
        permutation(idx + 1);
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