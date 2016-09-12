package ua.epam;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Space on 11.09.2016.
 */
public class SelectionSortTest {
    @Test
    public static void main(String[] args) {
int[][] data = {{}, {1}, {0, 3, 2, 1}, {4, 3, 2, 1, 0}, {15, 18, 6, 169, 17, 14, 87, 12, 1, 10, 11}};
for (int[] arr : data) {
System.out.print(Arrays.toString(arr) + " -> ");
SelectionSort.sort(arr);
System.out.println(Arrays.toString(arr));
}
}
}
