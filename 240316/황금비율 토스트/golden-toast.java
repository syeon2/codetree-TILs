import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String str = sc.next();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            list.add(str.charAt(i));
        }

        ListIterator<Character> iterator = list.listIterator(list.size());

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

        iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}