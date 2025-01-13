package TwoDimensionalArray;

public class basics2d {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid [0][0] = 20;
        grid [0][1] = 40;
        grid [0][2] = 260;
        System.out.println(grid[0][1]);
        System.out.println(grid[2][2]); // by default 0 bcz we didn't initialize it

    }
}
