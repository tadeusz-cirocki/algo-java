import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Map<Integer, List<Integer>> graph = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String[] connection = scanner.nextLine().split(" ");
                int a = Integer.parseInt(connection[0]);
                int b = Integer.parseInt(connection[1]);

                // Add connection between vertices
                graph.computeIfAbsent(a, ArrayList::new).add(b);
                graph.computeIfAbsent(b, ArrayList::new).add(a);
            }

            int numberOfGroups = getNumberOfSeparatedGraphs(graph);
            System.out.println(numberOfGroups);
        }
    }

    private static int getNumberOfSeparatedGraphs(Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        int numberOfGroups = 0;

        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                dfs(vertex, graph, visited);
                numberOfGroups++;
            }
        }

        return numberOfGroups;
    }

    private static void dfs(int vertex, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        visited.add(vertex);

        if (graph.containsKey(vertex)) {
            for (int neighbor : graph.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    dfs(neighbor, graph, visited);
                }
            }
        }
    }
}
