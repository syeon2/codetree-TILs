import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();
        int seconds = sc.nextInt();

        Bomb bomb = new Bomb(str, s, seconds);
        bomb.print();
    }

    public static class Bomb {
        private String code;
        private String color;
        private int seconds;

        public Bomb(String code, String color, int seconds) {
            this.code = code;
            this.color = color;
            this.seconds = seconds;
        }

        public void print() {
            System.out.println("code : " + this.code);
            System.out.println("color : " + this.color);
            System.out.println("second : " + this.seconds);
        }
    }
}