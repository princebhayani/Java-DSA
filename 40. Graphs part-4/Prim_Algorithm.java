import java.util.*;

public class Prim_Algorithm {
    static class Edge {
        int src, wt;
        int dest;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair>{
        int vertex;
        int cost;

        public Pair(int v, int c){
            this.vertex=v;
            this.cost=c;
        }

        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void prims(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost =0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.vertex]){
                vis[curr.vertex] =true;
                finalCost += curr.cost;

                for(int i =0;i<graph[curr.vertex].size();i++){
                    Edge e = graph[curr.vertex].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("Minimum cost of MST : "+finalCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }
}
