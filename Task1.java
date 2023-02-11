import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            originalList.add(i, rand.nextInt(100));
        }
        System.out.printf("Cписок: %s\n", originalList);

        System.out.printf("Перевернутый список: %s\n", reverseLinkedList(originalList));

    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList;
    }
}
