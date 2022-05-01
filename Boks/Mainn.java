public class Mainn {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alex", 10, 100, 100, 30);
        Fighter f2 = new Fighter("Burak", 10, 100, 85, 40);

        Ring match = new Ring(f1, f2, 80, 100);
        match.run();

    }
}