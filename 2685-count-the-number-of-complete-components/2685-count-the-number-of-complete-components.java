class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        boolean[] visited = new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int[] info = new int[2]; // info[0] = nodes, info[1] = degreeSum
                dfs(i, graph, visited, info);

                int nodes = info[0];
                int degreeSum = info[1];

                if (degreeSum == nodes * (nodes - 1)) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private void dfs(int u, List<Integer>[] graph, boolean[] visited, int[] info) {
        visited[u] = true;
        info[0]++;                     // node count
        info[1] += graph[u].size();    // degree

        for (int v : graph[u]) {
            if (!visited[v]) {
                dfs(v, graph, visited, info);
            }
        }
    }
}