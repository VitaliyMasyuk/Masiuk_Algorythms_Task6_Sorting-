package ua.epam;

import java.util.Arrays;

public class SelectionSort {
public static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                //System.out.println("min=" + min);
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;

        }
    }
}
