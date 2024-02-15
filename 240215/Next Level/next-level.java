import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int lv = sc.nextInt();

        Char one = new Char(id, lv);
        Char two = new Char("codetree", 10);

        two.print();
        one.print();
    }

    public static class Char {
        public String id;
        public int lv;

        public Char(String id, int lv) {
            this.id = id;
            this.lv = lv;
        }

        public void print() {
            System.out.printf("user %s lv %d\n", this.id, this.lv);
        }
    }
}