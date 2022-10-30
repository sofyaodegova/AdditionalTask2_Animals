public class Duck extends Animal {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.move();
    }

    @Override
    public void move() {
        System.out.println("Я полетела");
    }
}