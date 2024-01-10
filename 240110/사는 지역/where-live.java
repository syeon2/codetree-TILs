import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Area area = new Area(sc.next(), sc.next(), sc.next());

        for (int i = 0; i < N - 1; i++) {
            String name = sc.next();
            String pos = sc.next();
            String country = sc.next();

            Area area2 = new Area(name, pos, country);

            if (area.isFirst(area2.getName())) area = area2;
        }

        area.print();
    }

    public static class Area {
        private String name;
        private String pos;
        private String country;

        public Area(String name, String pos, String country) {
            this.name = name;
            this.pos = pos;
            this.country = country;
        }

        public boolean isFirst(String otherName) {
            if (otherName.startsWith(this.name) && this.name.length() < otherName.length()) return true;
            else if (this.name.startsWith(otherName) && this.name.length() > otherName.length()) return false;

            int N = Math.min(this.name.length(), otherName.length());

            for (int i = 0; i < N; i++) {
                if (name.charAt(i) < otherName.charAt(i)) {
                    return true;
                } else if (name.charAt(i) > otherName.charAt(i)) {
                    return false;
                }
            }

            return true;
        }

        public String getName() {
            return this.name;
        }

        public void print() {
            System.out.printf("name %s\n", this.name);
            System.out.printf("addr %s\n", this.pos);
            System.out.printf("city %s\n", this.country);
        }
    }
}