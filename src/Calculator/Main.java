package Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(11,22,38,15,-41));

        System.out.println(calculator.sum(2.5f,98.2f,45.2f,96.2f));

        System.out.println(calculator.sum(2.5, 48.5, 78.5, 33.2));

        System.out.println(calculator.dif(4,2));

        System.out.println(calculator.dif(4,8,13));

        System.out.println(calculator.prod(22,18));

        System.out.println(calculator.prod(12,33,21));

        System.out.println(calculator.quot(64,8));

        System.out.println(calculator.quot(32,8,2));
    }

}
