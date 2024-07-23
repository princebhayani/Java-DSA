import java.util.*;

public class Kosaraju_Algorithm_Strongly_Connected_Component {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void topologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> s ){
        vis[curr] =true;
        for(int i =0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }

    }

    public static void kosaraju(ArrayList<Edge>[] graph, int V){
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i =0;i<V;i++){
            if(!vis[i]){
                topologicalSortUtil(graph, i, vis, s);
            }
        }

        ArrayList<Edge>[] transpose = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false;
            transpose[i] = new ArrayList<>();
        }

        for(int i =0;i<V;i++){
            for(int j =0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        while (!s.isEmpty()) {
            int curr = s.pop();
            if(!vis[curr]){
                dfsUtil(transpose, curr, vis);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}