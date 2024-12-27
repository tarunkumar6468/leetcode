import java.util.Arrays;

public class Row_Column_matrix_search_element {
    public static void main(String[] args){
        int [][]matrix = {
                {10,20,30,40},
                {15,22,32,45},
                {28,29,37,49},
                {32,34,39,50}

        };
        int target = 37;
        int [] ans = searchElement(matrix,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchElement(int[][]arr, int target){
        int r = 0;
        int c = arr.length-1;
        while(r<=arr.length-1 && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]<target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
