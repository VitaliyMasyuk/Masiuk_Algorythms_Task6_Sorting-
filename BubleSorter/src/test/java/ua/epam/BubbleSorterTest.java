package ua.epam;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Space on 11.09.2016.
 */
public class BubbleSorterTest {
    @Test
    public static void main(String[] args) {
        int[][] data = {{}, {1}, {0, 3, 2, 1}, {4, 3, 2, 1, 0}, {6, 7, 3, 123, 5, 4, 1, 2, 0, 9, 15},};
for (int[] arr : data) {
System.out.print(Arrays.toString(arr) + " -> ");
BubbleSorter.sort(arr);
System.out.println(Arrays.toString(arr));
}
}
}











