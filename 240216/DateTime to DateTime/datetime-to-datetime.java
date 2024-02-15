import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 현재 시간보다 일이 같고 시간이 적을 경우
        if (a == 11 && ((b < 11) || (b == 11 && c < 11))) {
            System.out.print(-1);
        } else {
            // 11일 11시 11분을 11일 1시 1분 기준으로 시간 측정
            // a일 b시 c분을 11일 1시 1분 기준으로 시간 측정
            // 두 측정의 차를 반환

            int start = (11 * 24 * 60) + (11 * 60) + 11;
            int end = (a * 24 * 60) + (b * 60) + c;

            System.out.print(end - start);
        }
    }
}