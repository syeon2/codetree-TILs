import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int code = sc.nextInt();

        Product one = new Product(name, code);
        Product two = new Product("codetree", 50);

        two.print();
        one.print();
    }

    public static class Product {
        public String name;
        public int code;

        public Product(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public void print() {
            System.out.printf("product %d is %s\n", this.code, this.name);
        }
    }
}