package task2;

public class User<T,N> {
    private T id;
    private N card_number;

    public User (T id, N card_number){
        this.id = id;
        this.card_number = card_number;
    }

    public T getId() {
        return id;
    }
    public N getCard_number() {
        return card_number;
    }
}
