import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String pos = sc.next();
        int time = sc.nextInt();

        Obj obj = new Obj(code, pos, time);
        obj.print();
    }

    public static class Obj {
        public String code;
        public String pos;
        public int time;

        public Obj(String code, String pos, int time) {
            this.code = code;
            this.pos = pos;
            this.time = time;
        }

        public void print() {
            System.out.printf("secret code : %s\nmeeting point : %s\ntime : %d", this.code, this.pos, this.time);
        }
    }
}