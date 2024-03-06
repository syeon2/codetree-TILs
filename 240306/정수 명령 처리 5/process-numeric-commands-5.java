import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            
            if (str.equals("push_back")) {
                int num = sc.nextInt();
                list.add(num);
            } else if (str.equals("pop_back")) {
                list.remove(list.size() - 1);
            } else if (str.equals("size")) {
                System.out.println(list.size());
            } else {
                int num = sc.nextInt();

                System.out.println(list.get(num - 1));
            }
        }
    }
}