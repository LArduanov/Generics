package task1;

public class Calculator {

    public static <M> void addition(M x, M y) {
        try {
            Integer z = (Integer) x + (Integer) y;
            System.out.println(x +" + "+  y + " = " + z);
        } catch (Throwable t) {
            System.out.println(x +" + "+  y + " = Ошибка! Введите числа!");
        }
    }

    public static <M,N> void subtraction(M x, N y) {
        try {
            Integer z = (Integer) x - (Integer) y;
            System.out.println(x +" - "+  y + " = " + z);
        } catch (Throwable t) {
            System.out.println(x +" - "+  y + " = Ошибка! Введите числа!");
        }
    }

    public static <M,N> void multiplication(M x, N y) {
        try {
            Integer z = (Integer) x * (Integer) y;
            System.out.println(x +" * "+  y + " = " + z);
        } catch (Throwable t) {
            System.out.println(x +" * "+  y + " = Ошибка! Введите числа!");
        }
    }

    public static <M,N> void division(M x, N y) {
        if ((Integer)y == 0) {
            System.out.println(x +" / "+  y + " = На ноль делить нельзя!");
        } else {
            try {
                Integer z = (Integer) x / (Integer) y;
                System.out.println(x +" / "+  y + " = " + z);
            } catch (Throwable t) {
                System.out.println(x +" / "+  y + " = Ошибка! Введите числа!");
            }
        }
    }
}
