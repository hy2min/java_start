package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length ; column++) {
                System.out.print(arr[row][column]+ " "); //0열 촐력
            }
            System.out.println(); //한 행이 끝나면 라인을 변경하다.

        }
    }
}
