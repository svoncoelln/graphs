import edu.princeton.cs.algs4.Bag;
import java.io.InputStream;
import java.util.Scanner;

public class Graph {
    private int V;
    private int E;

    private Bag<Integer>[] g;

    public Graph(int v) {
        g = (Bag<Integer>[]) new Bag[v];
    }

    public Graph(InputStream in) {
        Scanner scan = new Scanner(in);
        V = scan.nextInt();
        E = scan.nextInt();
        g = (Bag<Integer>[]) new Bag[V];
        for (int i = 0; i < V; i++) {
            g[i] = new Bag<Integer>();
        }
        while (scan.hasNext()) {
            addEdge(scan.nextInt(), scan.nextInt());
        }
    }

    public void addEdge(int v, int w) {
        g[v].add(w);
        g[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return g[v];
    }
}
