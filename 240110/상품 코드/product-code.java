import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int code = sc.nextInt();

        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(name, code);

        product1.print();
        product2.print();
    }

    public static class Product {
        private String name;
        private int code;

        public Product(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public void print() {
            System.out.printf("product %d is %s\n", this.code, this.name);
        }
    }
}