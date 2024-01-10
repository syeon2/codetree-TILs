import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int K = sc.nextInt();
        String s = sc.next();

        String[] list1 = new String[n];

        for (int i = 0; i < n; i++) {
            list1[i] = sc.next();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            
            if (list1[i].length() < s.length()) continue;
            else {
                boolean flag = true;

                for (int k = 0; k < s.length(); k++) {
                    if (list1[i].charAt(k) != s.charAt(k)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) cnt++;
            }
        }

        String[] list2 = new String[cnt];
        int cnt2 = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (list1[i].length() < s.length()) continue;
            else {
                boolean flag = true;

                for (int k = 0; k < s.length(); k++) {
                    if (list1[i].charAt(k) != s.charAt(k)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) list2[cnt2++] = list1[i];
            }
        }

        Arrays.sort(list2);

        System.out.print(list2[K - 1]);
    }
}