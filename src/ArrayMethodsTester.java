public class ArrayMethodsTester
{
    public static void main(String[] args)
    {
        int[] numbers1 = new int[5];
        System.out.print("\nFillArray: ");
        ArrayMethods.printArray(numbers1);
        System.out.println("EXPECTED: 0 | 0 | 0 | 0 | 0\n");

        ArrayMethods.fillArray(numbers1, 3);
        System.out.print("\nFillArray: ");
        ArrayMethods.printArray(numbers1);
        System.out.println("EXPECTED: 3 | 3 | 3 | 3 | 3\n");

        int[] numbers2 = {4, 0, 5, -2, 1};
        System.out.print("\nFindSum: ");
        System.out.println(ArrayMethods.findSum(numbers2));
        System.out.println("EXPECTED: 8\n");

        System.out.print("\nFindAverage: ");
        System.out.println(ArrayMethods.findAverage(numbers2));
        System.out.println("EXPECTED: 1.6\n");

        System.out.print("\nFindMin: ");
        System.out.println(ArrayMethods.findMin(numbers2));
        System.out.println("EXPECTED: -2\n");

        System.out.print("\nFindMax: ");
        System.out.println(ArrayMethods.findMax(numbers2));
        System.out.println("EXPECTED: 5\n");

        int[] radii = {1, 2, 3, 4};
        double[] areas = ArrayMethods.findAreas(radii);
        System.out.print("\nFindAreas: ");
        ArrayMethods.printArray(areas);
        System.out.println("EXPECTED: 3.141592653589793 | 12.566370614359172 | 28.274333882308138 | 50.26548245743669\n");

        double[] nums3 = {4.2, 1.7, 0.9, 5.2, 7.8, -1};
        System.out.println("\nAllPositive: " + ArrayMethods.allPositive(nums3));
        System.out.println("EXPECTED: false");

        double[] nums4 = {4.2, 1.7, 0.9, 5.2, 7.8, 0.001};
        System.out.println("\nAllPositive: " + ArrayMethods.allPositive(nums4));
        System.out.println("EXPECTED: true");

        double[] nums41 = {4.2, 1.7, 0.9, 0, 5.2, 7.8};
        System.out.println("\nAllPositive: " + ArrayMethods.allPositive(nums41));
        System.out.println("EXPECTED: false");

        double[] nums5 = {-4.2, -1.7, -0.9, -5.2, -7.8, 0, -1};
        System.out.println("\nAnyPositive: " + ArrayMethods.anyPositive(nums5));
        System.out.println("EXPECTED: false");

        double[] nums6 = {-4.2, -1.7, -0.9, -5.2, -7.8, 0.001};
        System.out.println("\nAnyPositive: " + ArrayMethods.anyPositive(nums6));
        System.out.println("EXPECTED: true");

        double[] nums7 = {5.2, -6.1, -3.2, 7.9, 6.0, -1};
        System.out.println("\nCountPositive: " + ArrayMethods.countPositive(nums7));
        System.out.println("EXPECTED: 3");

        double[] nums8 = {-4.2, -1.7, -0.9, -5.2, -7.8, 0, -1};
        System.out.println("\nCountPositive: " + ArrayMethods.countPositive(nums8));
        System.out.println("EXPECTED: 0");

        int[] nums9 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8};
        System.out.println("\nIsSorted: " + ArrayMethods.isSorted(nums9));
        System.out.println("EXPECTED: false");

        int[] nums10 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\nIsSorted: " + ArrayMethods.isSorted(nums10));
        System.out.println("EXPECTED: true");

        int[] nums11 = {0, 1, 2, 3, 15, 5, 6, 7, 8, 9, 10};
        System.out.println("\nIsSorted: " + ArrayMethods.isSorted(nums11));
        System.out.println("EXPECTED: false");

        int[] nums12 = {-9, -8, -7, -6, -5, -4, -3};
        System.out.println("\nIsSorted: " + ArrayMethods.isSorted(nums12));
        System.out.println("EXPECTED: true");
    }
}