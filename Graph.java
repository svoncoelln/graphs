import edu.princeton.cs.algs4.Bag;
import java.io.InputStream;
import java.util.Scanner;

public class Graph {
    private int V;
    private int E;

    Bag<Integer>[] g;

    public Graph(int v) {
        g = (Bag<Integer>[]) new Bag[v];
    }

    public void addEdge(int v, int w) {
        g[v].add(w);
        g[w].add(v);
        E++;
    }

    public Graph(InputStream in) {
        Scanner scan = new Scanner(in);
        V = scan.nextInt();
        E = scan.nextInt();
        for (int i = 0; i < E; i++) {
            addEdge(scan.nextInt(), scan.nextInt());
        }
    }
}
