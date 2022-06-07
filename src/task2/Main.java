package task2;

public class Main {
    public static void main(String[] args) {
        User<Integer,Integer> person1 = new User<>(111,11111);
        User<String,String> person2 = new User<>("id222","CN22222");
        User<Integer,String> person3 = new User<>(333,"CN33333");

        System.out.println(person1.getId() +" " +person2.getId()+ " "+person3.getId());
        System.out.println(person1.getCard_number() +" " +person2.getCard_number()+ " "+ person3.getCard_number());
    }
}
