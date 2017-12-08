package Week4_Class1;

public class Classes {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        DoubleArray da = new DoubleArray();

        da.printArray(arr);
        da.doubleIt(arr);
        da.printArray(arr);
    }

    private static class DoubleArray {
        void doubleIt(int[] a) {
            for (int i = 0; i < a.length; i++) {
                a[i] *= 2;
            }
        }

        void printArray(int[] a) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
