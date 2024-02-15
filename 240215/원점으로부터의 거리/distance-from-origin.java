import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Position[] list = new Position[N];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[i] = new Position(x, y, i + 1);
        }

        Arrays.sort(list, new Comparator<Position>() {
            @Override
            public int compare(Position a, Position b) {
                if ((Math.abs(a.x) + Math.abs(a.y)) == (Math.abs(b.x) + Math.abs(b.y))) {
                    return a.num - b.num;
                }

                return (Math.abs(a.x) + Math.abs(a.y)) - (Math.abs(b.x) + Math.abs(b.y));
            };
        });

        for (int i = 0; i < N; i++) {
            list[i].print();
        }
    }

    public static class Position {
        public int x;
        public int y;
        public int num;

        public Position(int x, int y, int num) {
            this.x = x;
            this.y = y;
            this.num = num;
        }

        public void print() {
            System.out.printf("%d\n", this.num);
        }
    }

}