import java.util.LinkedList;

public class Linkedlist4 {

    public static LinkedList<String> birlashtir(LinkedList<String> l1, LinkedList<String> l2) {
        LinkedList<String> natija = new LinkedList<>();
        natija.addAll(l1);
        natija.addAll(l2);
        return natija;
    }

    public static LinkedList<String> nusxaOlish(LinkedList<String> list) {
        return new LinkedList<>(list);
    }


    public static void birinchisiniOchirishVaChiqarish(LinkedList<String> list) {
        if (!list.isEmpty()) {
            list.removeFirst();
        }

        System.out.println("Qolgan elementlar:");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        LinkedList<String> qishloq1 = new LinkedList<>();
        qishloq1.add("Paxtachi");
        qishloq1.add("X");
        qishloq1.add("Y");

        LinkedList<String> eskiqishloq = new LinkedList<>();
        eskiqishloq.add("A");
        eskiqishloq.add("B");
        eskiqishloq.add("C");

        // a)
        LinkedList<String> birlashgan = birlashtir(qishloq1, eskiqishloq);
        System.out.println("Birlashgan LinkedList: " + birlashgan);

        // b)
        LinkedList<String> nusxa = nusxaOlish(qishloq1);
        System.out.println("Nusxa olingan LinkedList: " + nusxa);

        // c)
        System.out.println("\nBirinchi element o‘chirilgandan keyin:");
        birinchisiniOchirishVaChiqarish(qishloq1);
    }
}
