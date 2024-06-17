package FOP_Viva;

public class Solution {
    private boolean isSameDimension(int[][] a, int[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i].length != b[i].length) return false;
        return true;
    }

    public int[][] add(int[][] a, int[][] b) {
        if (!isSameDimension(a, b)) return null;
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) c[i][j] = a[i][j] + b[i][j];
        return c;
    }

    public int[][] subtract(int[][] a, int[][] b) {
        if (!isSameDimension(a, b)) return null;
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) c[i][j] = a[i][j] - b[i][j];
        return c;
    }

    public int[][] multiply(int[][] a, int[][] b) {
        if (a[0].length != b.length) return null;
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++) c[i][j] += a[i][k] * b[k][j];
        return c;
    }
}
