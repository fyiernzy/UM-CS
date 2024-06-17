package FOP_Viva;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8, 9}, {10, 11, 12}};

        System.out.println(sol.add(a, b));

    }
}
