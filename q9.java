import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxSum = 0;
        int rowMaxSum = -1;

        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int value : arr[i]) {
                rowSum += value;
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                rowMaxSum = i + 1; 
            }
        }
        System.out.println("Row with the maximum sum: " + rowMaxSum);
        System.out.println("Maximum sum: " + maxSum);

    }
}