import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int[] nList = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            nList[i] = Integer.parseInt(strs[i]);
            total += nList[i];
        }

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {

            for (int k = 0; k < 5; k++) {
                if (i == k) continue;

                for (int j = 0; j < 5; j++) {

                    if (i == j || k == j) continue;

                    for (int l = 0; l < 5; l++) {
                        if (i == l || k == l || j == l) continue;

                        int team1 = nList[i] + nList[k];
                        int team2 = nList[j] + nList[l];
                        int team3 = total - team1 - team2;

                        if (team1 != team2 && team2 != team3 && team1 != team3) {
                            int max = Math.max(team1, Math.max(team2, team3));
                            int min = Math.min(team1, Math.min(team2, team3));

                            diff = Math.min(diff, (max - min));
                        }
                    }
                }
            }
        }

        if (diff == Integer.MAX_VALUE) bw.write("-1");
        else bw.write(String.valueOf(diff));

        bw.flush();
        bw.close();
    }
}