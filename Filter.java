import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Filter {

    public void fil(HashSet<Laptop> set) {
        System.out.println("Выберете параметры поиска");
        System.out.println("Стоимость. Введите 1 - менее 30000 руб, 2- менее 55000 руб, 3 - менее 100000 руб");
        HashMap<Integer, Integer> price = new HashMap<>();
        price.put(1, 30000);
        price.put(2, 55000);
        price.put(3, 100000);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("Оперативная память 1 - 4 ГБ, 2- 8 ГБ, 3-16 ГБ");
        HashMap<Integer, Integer> ram = new HashMap<>();
        ram.put(1, 4);
        ram.put(2, 8);
        ram.put(3, 16);
        int m = in.nextInt();

        System.out.println("Диагональ 1 - 14 дюймов, 2- 15.6 дюймов , 3-17 дюймов");
        HashMap<Integer, Integer> diagonal = new HashMap<>();
        diagonal.put(1, 14);
        diagonal.put(2, 15);
        diagonal.put(3, 17);
        int k = in.nextInt();

        System.out.println("Процессор 1 -Intel Pentium, 2 - Intel Core i5 , 3-Intel Core i3");
        HashMap<Integer, String> cpu = new HashMap<>();
        cpu.put(1, "Intel Pentium");
        cpu.put(2, "Intel Core i5");
        cpu.put(3, "Intel Core i3");
        int c = in.nextInt();
        in.close();

        HashSet<Laptop> newLaptops = (HashSet<Laptop>) set.stream()
                .filter(l -> l.getRam() >= ram.get(m)).map(l -> l)
                .filter(l -> l.getDiagonalScreen() >= diagonal.get(k)).map(l -> l)
                .filter(l -> l.getCpu() == cpu.get(c)).map(l -> l)
                .filter(l -> l.getPrice() < price.get(n)).map(l -> l).collect(Collectors.toSet());
         
        if(newLaptops.isEmpty()){
            System.out.println("Ничего не найдено");
        }else{
             System.out.println(newLaptops);
        }
    }

}
