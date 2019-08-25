public static class BinarySearch {
public static int recursiveSearch(int[] array, int left, int right, int x){
        if(right >= left) {
                int mid = left + (right -1) / 2;
                if(array[mid] == x) {
                        return mid;
                }
                if(array[mid] > x) {
                        recursiveSearch(array, left, mid-1, x);
                }
                if(array[mid] < x) {
                        recursiveSearch(array, mid+1, right, x);
                }
        }
}
}
