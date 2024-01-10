import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        Basic basic1 = new Basic("codetree", 10);
        Basic basic2 = new Basic(id, level);

        basic1.print();
        basic2.print();
    }

    public static class Basic {
        private String id;
        private int level;

        public Basic(String id, int level) {
            this.id = id;
            this.level = level;
        }

        public void print() {
            System.out.printf("user %s lv %d\n", id, level);
        }
    }
}