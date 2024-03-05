import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char[] alp = new char[N];

        for (int i = 0; i < N; i++) {
            alp[i] = sc.next().charAt(0);
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            char target = alp[i];
            char comp = (char) (i + 'A');

            if (target == comp) continue;
            
            for (int k = i + 1; k < N; k++) {
                if (comp == alp[k]) {
                    alp[k] = target;
                    alp[i] = comp;
                    ans++;
                    break;
                }
            }
        }

        System.out.print(ans);
    }
}