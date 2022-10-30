public class Fish extends Animal {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.move();
    }

    @Override
    public void move() {
        System.out.println("Я поплыла");
    }
}
