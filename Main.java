import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Acer", 15, "Intel Pentium", 8);
        Laptop laptop2 = new Laptop("HAIER", 15, "Intel Core i5", 16);
        Laptop laptop3 = new Laptop("HP", 17, "Intel Core i5", 8);
        Laptop laptop4 = new Laptop("Acer", 14, "Intel Core i3", 4);

        laptop.setPrice(32520);
        laptop2.setPrice(52250);
        laptop3.setPrice(85250);
        laptop4.setPrice(25140);

        HashSet<Laptop> laptoSet = new HashSet<>();
        laptoSet.add(laptop);
        laptoSet.add(laptop2);
        laptoSet.add(laptop3);
        laptoSet.add(laptop4);
        System.out.println(laptoSet);

        Filter filter = new Filter();
        filter.fil(laptoSet);
        ;

    }

}
