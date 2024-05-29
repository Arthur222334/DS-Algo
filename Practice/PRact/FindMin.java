package PRact;

public class FindMin {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, 5, 6, 7, 8, -9};
        System.out.println(min(array));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}

