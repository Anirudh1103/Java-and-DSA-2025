import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,6,5,1,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int temp = arr[i], j = i-1;
            while(j > -1 &&  temp < arr[j])
            {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
