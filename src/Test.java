// тест сортировок
public class Test {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        int testLen = 100000000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];
        int[] arr3 = new int[testLen];

        System.out.println("\n-----Случайный массив------");

        for (int i = 0; i < testLen; i++) {
            arr3[i] = arr2[i] = arr1[i] = (int) Math.round(Math.random() * 10000);
        }

        System.out.println("Быстрая сортировка:");
        measureTime(() -> QuickSort.quickSort(arr1, 0, testLen - 1));

        System.out.println("Сортировка пузырьком:");
        measureTime(() -> BubbleSort.bubbleSort(arr2));

        System.out.println("Сортировка выбором:");
        measureTime(() -> SelectionSort.selectionSort(arr3));
    }

    private static void test2() {
        int testLen = 100000000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];
        int[] arr3 = new int[testLen];

        System.out.println("\n-----Отсортированный массив------");

        for (int i = 0; i < testLen; i++) {
            arr3[i] = arr2[i] = arr1[i] = i;
        }

        System.out.println("Быстрая сортировка:");
        measureTime(() -> QuickSort.quickSort(arr1, 0, testLen - 1));

        System.out.println("Сортировка пузырьком:");
        measureTime(() -> BubbleSort.bubbleSort(arr2));

        System.out.println("Сортировка выбором:");
        measureTime(() -> SelectionSort.selectionSort(arr3));
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }
}
