import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();
        int N = sc.nextInt();

        Func func = new Func(str, s, N);

        func.print();
    }

    public static class Func {
        private String secretCode;
        private String meetingPoint;
        private int time;

        public Func(String secret, String meeting, int time) {
            this.secretCode = secret;
            this.meetingPoint = meeting;
            this.time = time;
        }

        public void print() {
            System.out.println("secret code : " + secretCode);
            System.out.println("meeting point : " + meetingPoint);
            System.out.println("time : " + time);
        }
    }
}