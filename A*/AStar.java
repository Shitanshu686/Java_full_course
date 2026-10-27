class AStar {

    static int[][] graph = {
            { 0, 2, 4, 0, 0 },
            { 2, 0, 1, 7, 0 },
            { 4, 1, 0, 3, 5 },
            { 0, 7, 3, 0, 2 },
            { 0, 0, 5, 2, 0 }
    };

    static int[] h = { 7, 6, 4, 2, 0 };

    static int[] open = new int[100];
    static int openSize = 0;

    static boolean[] closed = new boolean[5];

    static int[] g = new int[5];
    static int[] f = new int[5];
    static int[] parent = new int[5];

    static void addOpen(int node) {
        open[openSize] = node;
        openSize++;
    }

    static boolean isInOpen(int node) {

        for (int i = 0; i < openSize; i++) {
            if (open[i] == node) {
                return true;
            }
        }

        return false;
    }

    static int getBestNode() {

        int bestIndex = 0;

        for (int i = 1; i < openSize; i++) {

            if (f[open[i]] < f[open[bestIndex]]) {
                bestIndex = i;
            }
        }

        return bestIndex;
    }

    static int removeBestNode() {

        int index = getBestNode();

        int node = open[index];

        for (int i = index; i < openSize - 1; i++) {
            open[i] = open[i + 1];
        }

        openSize--;

        return node;
    }

    static void printPath(int goal) {

        int[] path = new int[100];
        int size = 0;

        int current = goal;

        while (current != -1) {

            path[size] = current;
            size++;

            current = parent[current];
        }

        System.out.print("Path: ");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(path[i]);

            if (i != 0) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }

    static void aStar(int start, int goal) {

        for (int i = 0; i < 5; i++) {
            g[i] = Integer.MAX_VALUE;
            f[i] = Integer.MAX_VALUE;
            parent[i] = -1;
            closed[i] = false;
        }

        g[start] = 0;
        f[start] = g[start] + h[start];

        addOpen(start);

        while (openSize > 0) {

            int current = removeBestNode();

            System.out.println(
                    "Visiting: " + current +
                            "  g=" + g[current] +
                            "  h=" + h[current] +
                            "  f=" + f[current]);

            if (current == goal) {

                System.out.println("Goal Found!");
                printPath(goal);
                return;
            }

            closed[current] = true;

            for (int i = 0; i < 5; i++) {

                if (graph[current][i] != 0 && !closed[i]) {

                    int newG = g[current] + graph[current][i];

                    if (!isInOpen(i)) {

                        addOpen(i);

                        g[i] = newG;
                        f[i] = g[i] + h[i];
                        parent[i] = current;

                    } else if (newG < g[i]) {

                        g[i] = newG;
                        f[i] = g[i] + h[i];
                        parent[i] = current;
                    }
                }
            }
        }

        System.out.println("Goal Not Found");
    }

    public static void main(String[] args) {

        int start = 0;
        int goal = 4;

        aStar(start, goal);
    }
}