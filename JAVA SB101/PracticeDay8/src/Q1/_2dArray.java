package Q1;

public class _2dArray {
    public static void main(String[] args){
        int row=2;
        int column=4;
        int[][] arr={
                {0,1,2},
                {3,4},
                {5}
        };

        int[][] array=new int[row][column];
        noofRow(array);

    }
    static  void noofRow(int[][]array){
        System.out.println(array.length);
        System.out.println(array[0].length);
    }
}
