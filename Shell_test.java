package ShellSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Shell_test {

    @Test
    void SortTest() {
        ShellSort sort = new ShellSort();
        int[] data = { 10, 55, -5, 34, 7, 22, 19 };
        ShellSort.sort(data);
        Assertions.assertEquals(-5, data[0]);
        Assertions.assertEquals(7, data[1]);
        Assertions.assertEquals(10, data[2]);
        Assertions.assertEquals(55, data[6]);
    }
}
