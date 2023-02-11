import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            originalList.add(i, rand.nextInt(100));
        }
        System.out.printf("Cписок: %s \n", originalList);
        System.out.printf("Список с добавлением элемента в конец %s \n", enqueue(originalList, 15));

        System.out.printf("Первый элемент списка %s \n", dequeue(originalList));
        System.out.printf("Cписок после удаления первого элемента: %s \n", originalList);

        System.out.printf("Первый элемент списка %s \n", first(originalList));
        System.out.printf("Cписок без удаления первого элемента: %s \n", originalList);
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        return list;
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.getFirst();
        list.removeFirst();
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
