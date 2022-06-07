package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<>();
        number = elements(100);
        number.add(188);
        
        ArrayList<String> number1 = new ArrayList<>();
        number1 = elements(10);
        number1.add("Hello");

        ArrayList<Double> number2 = new ArrayList<>();
        number2 = elements(5);
        number2.add(3.42345345);


        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
    }

    public static <M> ArrayList<M> elements(int x) {
        ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                int number = (int) (Math.random() * (200))+ 1;
                numbers.add(number);
            }
            return (ArrayList<M>) numbers;
    }
}












