import java.util.*;

public class Main {
	public static void main(String[] args) {
		// 여기에 코드를 작성해주세요.
		Scanner sc = new Scanner(System.in);

		List<Character> list = new LinkedList<>();

		int N = sc.nextInt();
		int M = sc.nextInt();

		String str = sc.next();

		for (int i = 0; i < N; i++) {
			list.add(str.charAt(i));
		}

		ListIterator<Character> iter = list.listIterator();

		while (iter.hasNext()) {
			iter.next();
		}

		for (int i = 0; i < M; i++) {
			char c = sc.next().charAt(0);

			if (c == 'L') {
				if (iter.hasPrevious()) iter.previous();
			} else if (c == 'P') {
				char addedC = sc.next().charAt(0);

				iter.add(addedC);
			} else if (c == 'R') {
				if (iter.hasNext()) iter.next();
			} else {
				iter.next();
				iter.remove();
			}
		}

		while (iter.hasPrevious()) {
			iter.previous();
		}

		while (iter.hasNext()) {
			System.out.printf("%s", iter.next());
		}
	}
}