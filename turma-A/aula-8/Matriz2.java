public class Matriz2 {
    public static void main(String[] args) {
        int[][] tb = {{4,6}, {1,7}};
        for(int i = 0; i < tb.length; i++) {
            for(int j = 0; j < tb[0].length; j++) {
                System.out.print(tb[i][j] + " ");
            }
        }

        System.out.println();
    }
}