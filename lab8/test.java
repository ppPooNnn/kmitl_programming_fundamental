import java.util.*;
public class test {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 9, 8, 0};
        int[] newArr = new int[5];
        int i = 0;
        while(arr[i] > 0)
        {
            if(i == 0)
            {
                newArr[0] = arr[i];
                System.out.println("insert " + arr[i] + " -> " + Arrays.toString(newArr));
                i++;
                continue;
            }
            int j = i - 1;
            while(j >= 0 && arr[j] > arr[i] && arr[j] != 0)
            {
                newArr[j + 1] = newArr[j];
                j--;
            }
            newArr[j + 1] = arr[i];
            System.out.println("insert " + arr[i] + " -> " + Arrays.toString(newArr));
            i++;
        }
    }
}