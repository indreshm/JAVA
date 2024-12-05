package TCScodevita;
import java.util.*;

public class LoopMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> commands = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            commands.add(scanner.nextLine());
        }

        processCommands(commands);
    }

    private static void processCommands(List<String> commands) {
        Stack<Integer> loopCounts = new Stack<>();
        Stack<Integer> currentIterations = new Stack<>();
        StringBuffer resultBuffer = new StringBuffer();
        int i = 0;
        while (i < commands.size()) {
            String command = commands.get(i).trim();
            if (command.startsWith("for")) {
                int times = Integer.parseInt(command.split(" ")[1]);
                loopCounts.push(times);
                currentIterations.push(0);
            } else if (command.equals("do")) {
                i++;
                continue;
            } else if (command.equals("done")) {
                int currentCount = currentIterations.pop();
                int maxCount = loopCounts.pop();
                if (currentCount < maxCount - 1) {
                    currentIterations.push(currentCount + 1);
                    int j = i;
                    while (j >= 0 && !commands.get(j).trim().equals("for " + maxCount + " times")) {
                        j--;
                    }
                    i = j;
                }
            } else if (command.startsWith("break")) {
                int breakAt = Integer.parseInt(command.split(" ")[1]);
                if (currentIterations.peek() == breakAt - 1) {
                    while (!commands.get(i).trim().equals("done")) {
                        i++;
                    }
                }
            } else if (command.startsWith("continue")) {
                int continueAt = Integer.parseInt(command.split(" ")[1]);
                if (currentIterations.peek() == continueAt - 1) {
                    while (!commands.get(i).trim().equals("done")) {
                        i++;
                    }
                }
            } else if (command.startsWith("print")) {
                if (command.contains("\"") && command.contains("\"")) {
                    String statement = command.substring(command.indexOf("\"") + 1, command.lastIndexOf("\""));
                    resultBuffer.append(statement).append("\n");
                }
            }
            i++;
        }
        System.out.print(resultBuffer.toString());
    }
}
