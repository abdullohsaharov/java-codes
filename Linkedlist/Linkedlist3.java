import java.util.LinkedList;

public class Linkedlist3 {
    public static void main(String[] args) {
        LinkedList<String> tumanlar = new LinkedList<>();

        tumanlar.add("Mirzo ulugbek");
        tumanlar.add("Chilonzor");
        tumanlar.add("Yashnaobod");

        System.out.println("Original ro'yxat: " + tumanlar);

        deleter(tumanlar);

        System.out.println("O'chirilgandan keyin: " + tumanlar);
    }

    public static void deleter(LinkedList<String> tumanlar) {
        tumanlar.clear(); // barcha elementlarni o'chirish
    }
}
