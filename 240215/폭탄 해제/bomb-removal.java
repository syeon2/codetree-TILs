import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Obj obj = new Obj(code, color, second);

        obj.print();
    }

    public static class Obj {
        public String code;
        public String color;
        public int second;

        public Obj(String code, String color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }

        public void print() {
            System.out.printf("code : %s\ncolor : %s\nsecond : %d", this.code, this.color, this.second);
        }
    }
}