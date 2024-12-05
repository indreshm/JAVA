package TCScodevita;
import java.util.*;

public class FormTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of substrings
        int n = sc.nextInt();
        sc.nextLine();

        // Substring and cost
        List<Substring> substrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");
            String sub = input[0];
            int cost = Integer.parseInt(input[1]);
            substrings.add(new Substring(sub, cost));
        }

        // Main string
        String mainString = sc.nextLine().trim();

        // Validate input
        if (mainString == null || mainString.isEmpty()) {
            System.out.println("Impossible");
            return;
        }

        // Solve using DP
        int result = findMinimumCost(mainString, substrings);
        if (result == Integer.MAX_VALUE) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }
    }

    static int findMinimumCost(String mainString, List<Substring> substrings) {
        int n = mainString.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Cost to form an empty string is 0

        for (int i = 1; i <= n; i++) {
            for (Substring sub : substrings) {
                int len = sub.text.length();
                if (i >= len && mainString.substring(i - len, i).equals(sub.text)) {
                    if (dp[i - len] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i - len] + sub.cost);
                    }
                }
            }
        }

        return dp[n];
    }

    static class Substring {
        String text;
        int cost;

        Substring(String text, int cost) {
            this.text = text;
            this.cost = cost;
        }
    }
}

