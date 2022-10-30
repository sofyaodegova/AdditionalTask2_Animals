public class Cat extends Animal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.move();
    }

    @Override
    public void move() {
        System.out.println("Я побежал");
    }
}
