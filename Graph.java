import edu.princeton.cs.algs4.Bag;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    private int V;
    private int E;

    Bag<Integer>[] g;

    public Graph(int v) {
        g = (Bag<Integer>[]) new Bag[v];
    }

    public Graph(InputStream in) {
        Scanner scan = new Scanner(in);
        V = scan.nextInt();
        E = scan.nextInt();
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
    public static void main(String[] args) {
        Graph g = new Graph(System.in);
        ArrayList<Integer> seven = (ArrayList<Integer>) g.adj(7);
        for (int i : seven) {
            System.out.println(i);
        }
    }
}
