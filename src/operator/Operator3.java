package operator;

import org.w3c.dom.ls.LSOutput;

public class Operator3 {
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; // 1+ (2 * 3)와 동일
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
