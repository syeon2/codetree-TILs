import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        Student[] list = new Student[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            list[i] = new Student(name, height, weight);
        }

         Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                char[] list1 = a.name.toCharArray();
                char[] list2 = b.name.toCharArray();

                for (int i = 0; i < Math.min(list1.length, list2.length); i++) {
                    if (list1[i] > list2[i]) return 1;
                    else if (list1[i] < list2[i]) return -1;
                }

                if (list1.length > list2.length) return 1;
                else if (list1.length < list2.length) return -1;

                else return 1;
            }
        });

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            Student s = list[i];

            System.out.printf("%s %d %.1f\n", s.name, s.height, s.weight);
        }

        System.out.println("\nheight");
        Arrays.sort(list, (a, b) -> b.height - a.height);

        for (int i = 0; i < 5; i++) {
            Student s = list[i];

            System.out.printf("%s %d %.1f\n", s.name, s.height, s.weight);
        }
    }

    public static class Student {
        public String name;
        public int height;
        public double weight;

        public Student(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }
}