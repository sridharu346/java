public class bs {
    int binary(int arr[], int l, int r, int x) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        bs obj = new bs();
        int arr[] = { 2, 3, 4, 5, 8, 9, 10 };
        int n = arr.length;
        int x = 5;
        int result = obj.binary(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println(result);
        }
    }
}
