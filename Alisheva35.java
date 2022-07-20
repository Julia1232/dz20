package lesson19.lesson20;
interface AbleToEat {
    public void eat();
}
public class Alisheva35 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };
        ableToEat.eat();
    }
}

