import java.util.ArrayList;

public class GraphTraversalsDFS {
    static class Edge{
        int src,wt;
        int dest;
//        int wt;

        public Edge(int s, int d, int w){
            this.src= s;
            this.dest=d;
            this.wt =w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i =0;i< graph.length;i++){
            graph[i] =new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[5].add(new Edge(6,5,1));
    }
//    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){//O(n)==O(V+E)
//        System.out.print(curr+" ");
//        vis[curr] =true;
//
//        for(int i =0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//            if(!vis[e.dest]){
//                dfs(graph,e.dest,vis);
//            }
//        }
//
//    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i< graph.length;i++){
            dfsUtil(graph,i,vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean vis[]){//O(n)==O(V+E)
        System.out.print(curr+" ");
        vis[curr] =true;

        for(int i =0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }

    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dfs(graph);
    }
}
