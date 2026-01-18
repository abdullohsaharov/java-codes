import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMisol {
    public static void main(String[] args) {

        LinkedList<String> ismlar = new LinkedList<>();

        ismlar.add("Ali");
        ismlar.add("Vali");
        ismlar.add("Sardor");
        ismlar.add("Aziza");

        // b) iterator orqali chiqarish
        chiqarIteratorBilan(ismlar);

        // c) hajmini chiqarish va tozalash
        System.out.println("\nRo'yxat o'lchami: " + ismlar.size());
        ismlar.clear();
        System.out.println("Tozalangandan keyin o'lcham: " + ismlar.size());
    }

    // b) band uchun method
    public static void chiqarIteratorBilan(LinkedList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
