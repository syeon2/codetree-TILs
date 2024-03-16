import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[] list = sc.next().toCharArray();
        LinkedList<Character> list2 = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list2.add(list[i]);
        }

        ListIterator<Character> iterator = list2.listIterator(list2.size());

        for (int m = 0; m < M; m++) {
            char cmd = sc.next().charAt(0);

            if (cmd == 'L') {
                if (iterator.hasPrevious()) iterator.previous();
            } else if (cmd == 'R') {
                if (iterator.hasNext()) iterator.next();
            } else if (cmd == 'D') {
                if (iterator.hasNext()) {
                    iterator.next();
                    iterator.remove();
                }
            } else {
                char c = sc.next().charAt(0);

                iterator.add(c);
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i));
        }
    }
}