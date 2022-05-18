package ShellSort;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = Generate.generate(8000);
        long time1 = System.nanoTime();
        sort(array);
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);
    }


    public static void sort ( int[] a ) {
        int n = a.length;
        for (int step = n / 2; step > 0; step /= 2) {
            for (int i = step; i < n; i++) {
                for (int j = i - step; j >= 0 && a[j] > a[j + step] ; j -= step) {
                    int temp = a[j];
                    a[j] = a[j + step];
                    a[j + step] = temp;
                }
            }
        }
    }
}
