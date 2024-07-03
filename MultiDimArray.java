public class MultiDimArray {
    void d2Array() {
        // 2d Array
        System.out.println("\n2D Array\n");
        int marr[][] = new int[3][4], prev = 0;

        for (int arr[] : marr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = prev + (int) (100 + Math.random() * 50);
                prev = arr[i];
            }
        }
        for (int arr[] : marr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void d3Array() {
        // 3D Array
        System.out.println("\n3D Array\n");
        int arr3d[][][] = new int[3][4][5];
        for (int arr[][] : arr3d) {
            for (int arr2[] : arr) {
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (int) (100 + Math.random() * 100);
                }
            }
        }
        for (int arr[][] : arr3d) {
            for (int arr2[] : arr) {
                for (int i : arr2) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    void JaggedArray() {
        // Jagged Array
        System.out.println("\nJagged Array\n");
        int jarr[][] = new int[3][];
        jarr[0] = new int[4];
        jarr[1] = new int[3];
        jarr[2] = new int[5];
        for (int arr[] : jarr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (100 + Math.random() * 100);
            }
        }
        for (int arr[] : jarr) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MultiDimArray mda = new MultiDimArray();
        mda.d2Array();
        mda.d3Array();
        mda.JaggedArray();
    }
}
