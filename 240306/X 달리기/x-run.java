import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print(shortestTime(N) + 1);
        
    }

    public static int shortestTime(int X) {
        int time = 0;
        int speed = 1;

        while (X > 0) {
            time++;
            X -= speed;
            if (X <= speed) {
                break; // 남은 거리가 속력보다 작거나 같으면 반복문 종료
            }
            speed++; // 속력을 1m/s 씩 증가시킴
        }

        // 마지막에는 속력을 감소시켜서 1m/s로 맞춤
        while (speed > 1) {
            time++;
            X -= speed;
            if (X <= 0) {
                break; // 도착지에 도달했으면 반복문 종료
            }
            speed--; // 속력을 1m/s 씩 감소시킴
        }

        return time;
    }
}