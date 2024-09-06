import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] nList = new int[N];
        String[] strs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            nList[i] = Integer.parseInt(strs[i]);
        }

        ascSort(nList);

        for (int i = 0; i < N; i++) {
            sb.append(nList[i] + " ");
        }

        sb.append("\n");

        descSort(nList);
        for (int i = 0; i < N; i++) {
            sb.append(nList[i] + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void ascSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            
            for (int k = i; k < list.length; k++) {
                if (list[i] > list[k]) {
                    int temp = list[i];
                    list[i] = list[k];
                    list[k] = temp;
                }    
            }
        }
    }

    public static void descSort(int[] list) {
        for (int i = 0; i < list.length; i++) {

            for (int k = i; k < list.length; k++) {
                if (list[i] < list[k]) {
                    int temp = list[i];
                    list[i] = list[k];
                    list[k] = temp;
                }
            }
        }
    }
}