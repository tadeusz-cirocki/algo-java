import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> inputList = new ArrayList<>();

            while (scanner.hasNextInt()) {
                inputList.add(scanner.nextInt());
            }

            Set<Integer> distinctElements = new TreeSet<>(inputList);

            System.out.println("Distinct elements:");
            for (int element : distinctElements) {
                System.out.print(element + " ");
            }

            System.out.println("\nCount: " + inputList.size());
            System.out.println("Distinct: " + distinctElements.size());
            System.out.println("Min: " + Collections.min(inputList));
            System.out.println("Max: " + Collections.max(inputList));
        }
    }
}
