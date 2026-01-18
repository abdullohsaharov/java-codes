import java.util.LinkedList;

public class LinkedListMisol2 {

    public static void main(String[] args) {

        LinkedList<String> shahar = new LinkedList<>();

        shahar.add("Toshkent");
        shahar.add("Navoiy");
        shahar.add("Andijon");

        // boshiga va oxiriga qo‘shish
        shahar.addFirst("Fargona");
        shahar.addLast("Xorazim");

        // teskari tartibda chiqarish
        teskari(shahar);

        // bosh va oxir elementlarni chiqarish
        System.out.println("\nBirinchi element: " + shahar.getFirst());
        System.out.println("Oxirgi element: " + shahar.getLast());
    }

    public static void teskari(LinkedList<String> shahar) {
        System.out.println("Teskari tartib:");
        for (int i = shahar.size() - 1; i >= 0; i--) {
            System.out.println(shahar.get(i));
        }
    }
}
