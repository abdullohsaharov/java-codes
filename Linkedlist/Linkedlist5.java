import java.util.*;

public class Linkedlist5 {

    // a) LinkedList elementlarini aralashtirish
    public static void aralashtir(LinkedList<String> list) {
        Collections.shuffle(list);
    }

    // b) LinkedList ni ArrayList ga ko‘chirish
    public static ArrayList<String> arrayListgaKochirish(LinkedList<String> list) {
        return new ArrayList<>(list);
    }

    // c) Saralash va element bor-yo‘qligini tekshirish
    public static void saralashVaTekshirish(LinkedList<String> list, String qidirilayotgan) {
        Collections.sort(list);
        System.out.println("Saralangan LinkedList: " + list);

        if (list.contains(qidirilayotgan)) {
            System.out.println(qidirilayotgan + " elementi mavjud.");
        } else {
            System.out.println(qidirilayotgan + " elementi mavjud emas.");
        }
    }

    public static void main(String[] args) {

        LinkedList<String> qishloqlar = new LinkedList<>();
        qishloqlar.add("Paxtachi");
        qishloqlar.add("Buloqboshi");
        qishloqlar.add("Andijon");
        qishloqlar.add("Xo‘jaobod");

        System.out.println("Boshlang‘ich LinkedList: " + qishloqlar);

        // a)
        aralashtir(qishloqlar);
        System.out.println("Aralashtirilgan LinkedList: " + qishloqlar);

        // b)
        ArrayList<String> arrayList = arrayListgaKochirish(qishloqlar);
        System.out.println("ArrayList ga ko‘chirildi: " + arrayList);

        // c)
        saralashVaTekshirish(qishloqlar, "Andijon");
    }
}
