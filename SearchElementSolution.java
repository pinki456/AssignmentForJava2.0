import java.io.*;

class SearchElementSolution {

    // Returns index of x if it is present in arr[].
    int searchElement(int arr[], int x)
    {
        int low = 0,mid = 0, high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if(low == high && x != arr[mid])
            low++;
        return low;
    }

    // Driver code
    public static void main(String args[])
    {
        SearchElementSolution ob = new SearchElementSolution();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 20;
        int result = ob.searchElement(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at " + "index " + result);
    }
}