package Calculator;

public class Calculator {

        int sum(int... value) {
        int sum = 0;
        for (int x : value) {
            sum += x;

        }
        return sum;
    }

        float sum(float... value) {
        int sum = 0;
        for (float x : value) {
            sum += x;

        }
        return sum;
    }

    double sum(double... value) {
        int sum = 0;
        for (double x : value) {
            sum += x;

        }
        return sum;
    }

    int dif(int a, int b) {
            int result = a - b;
            return result;
    }

    int dif(int a, int b, int c) {
        int result = a - b - c;
        return result;
    }

    int prod(int a,int b) {
        int result = a * b;
        return result;
    }

    int prod(int a, int b, int c) {
            int result = a * b * c;
            return result;
    }

    int quot(int a, int b) {
            int result = a / b;
            return result;
    }

    int quot(int a, int b, int c) {
        int result = a / b / c;
        return result;
    }




}

