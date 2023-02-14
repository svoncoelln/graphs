import edu.princeton.cs.algs4.Bag;

public class Graph {
    private int V;
    private int E;

    Bag<Integer>[] g;

    public Graph(int v) {
        g = new Bag<Integer>[v];
    }

    public Graph(InputStream in) {
        V = Integer.parseInt(in.nextLine());
        g = new Bag<Integer>[V];
        E = Integer.parseInt(in.nextLine());
        for (int i = 0; i < E; i++) {
            addEdge(Integer.parseInt(in.next()), Integer.parseInt(in.next()));
        }
    }
}
