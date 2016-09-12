package ua.epam;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Space on 11.09.2016.
 */
public class InsertionSorterTest {
    @Test
    public static void main(String[] args) {
        int[][] data = {{}, {1}, {0, 3, 2, 1}, {4, 3, 2, 1, 0}, {61, 18, 23, 155, 55, 34, 21, 72, 0, 1, 87},};
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            InsertionSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}