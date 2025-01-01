package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        double dollar = 8;
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("계산된 원화 금액은 "+ dollar*1300 + "원입니다.");
        }
    }
}
