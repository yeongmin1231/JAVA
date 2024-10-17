package sec04.exam01;

public class Calculator {

    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    int plus(int x, int y) {
        return x + y;
    }

    double divide(int x, int y) {
        if (y == 0) {
            System.out.println("오류: 0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double)x / y;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        byte x = 10;
        byte y = 0;
        
        double result2 = myCalc.divide((int)x, (int)y);
        System.out.println("result2: " + result2);

        myCalc.powerOff();
    }
}
