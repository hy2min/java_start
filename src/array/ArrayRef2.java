package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5]; //배열 생성과 초기화

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;


        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
