import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> inputList = new ArrayList<>();

            while (scanner.hasNextInt()) {
                inputList.add(scanner.nextInt());
            }

            System.out.println("Pairs with sum 13:");
            for (int i = 0; i < inputList.size() - 1; i++) {
                int num1 = inputList.get(i);
                for (int j = i + 1; j < inputList.size(); j++) {
                    int num2 = inputList.get(j);
                    if (num1 + num2 == 13) {
                        System.out.println(num1 + " " + num2);
                    }
                }
            }
        }
    }
}
