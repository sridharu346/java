public class ls {
    static int linear(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;

    }
 
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int x = 40;

        int result = linear(arr, n, x);
        if (result == -1)
            System.out.println("Element is not found in the array list");
        else
            System.out.println(result);

    }

}
