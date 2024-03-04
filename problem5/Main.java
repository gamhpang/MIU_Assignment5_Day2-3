package problem5;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell","i7",16,1200);
        Computer computer2 = new Computer("Dell","i7",16,1200);
        System.out.println(computer.equals(computer2));
        System.out.println(computer.hashCode());
        System.out.println(computer2.hashCode());
    }
}
