import java.util.Arrays;

public class ArrayMethods
{
        /**
         * Replaces each element of an array with a certain value
         *
         * @param nums the array of numbers to be filled
         * @param value the number to fill the array with
         */
        public static void fillArray(int[] nums, int value)
        {
            for (int i = 0; i < nums.length; i++)
            {
                nums[i] = value;
            }
        }

        /**
         * Finds the sum of the elements in an array
         *
         * @param nums the array of numbers to add up
         * @return total the sum of the numbers in the array
         */
        public static int findSum(int[] nums)
        {
            int sum = 0;
            for (int i = 0; i < nums.length; i++)
            {
                sum = sum + nums[i];
            }

            return sum;
        }

        /**
         * Finds the average of the elements in an array
         *
         * @param nums the array of numbers to be averaged
         * @return average the average of the numbers in the array
         */
        public static double findAverage(int[] nums)
        {
            double sum = 0;
            double average = 0;
            for(int i = 0; i < nums.length; i++)
            {
                sum = sum + nums[i];
                average = sum / nums.length;
            }

            return average;
        }

        /**
         * Finds the minimum value in an array of numbers
         *
         * @param nums the array of numbers
         * @return min the minimum value in the array
         */
        public static int findMin(int[] nums)
        {
            int min = nums[0];
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] < min)
                {
                    min = nums[i];
                }
            }
            return min;
        }

        /**
         * Finds the maximum value in an array of numbers
         *
         * @param nums the array of numbers
         * @return max the maximum value in the array
         */
        public static int findMax(int[] nums)
        {
            int max = nums[0];
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] > max)
                {
                    max = nums[i];
                }
            }
            return max;
        }

        /**
         * Creates an array that stores the areas of circles given an array of radii
         *
         * @param radii the array of radii
         * @return areas an array of circle areas
         */
        public static double[] findAreas(int[] radii) {
            double[] areas = new double[radii.length]; // array that will store the areas

            double x = 0;
                for (int i = 0; i < radii.length; i++)
                {
                    areas[i] = Math.PI * Math.pow(radii[i], 2);
                }
            return areas;
        }

        /**
         * Returns true if the array contains all positive numbers and false otherwise
         *
         * @param nums the array to check
         * @return positive if the entire array is positive
         */
        public static boolean allPositive(double[] nums)
        {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] <= 0.00)
                {
                    return false;
                }
            }
            return true;
        }

        /**
         * Returns true if the array contains any positive numbers and false otherwise
         *
         * @param nums the array to check
         * @return positive whether or not the array is all positive
         */
        public static boolean anyPositive(double[] nums)
        {
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] > 0.00)
                {
                    return true;
                }
            }
            return false;
        }

        /**
         * Returns the amount of positive numbers in the array
         *
         * @param nums the array to check
         * @return count how many numbers in the array are positive
         */
        public static int countPositive(double[] nums)
        {
            int positive = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] > 0) {
                    positive = positive + 1;
                }
            }

            return positive;
        }

        /**
         * Returns true if the array is sorted from least to greatest and false otherwise
         *
         * @param nums the array to check
         * @return sorted whether the array is sorted or not
         */
        public static boolean isSorted(int[] nums)
        {
            for(int i = 0; i < nums.length-1; i++)
            {
                if(nums[i] > nums[i+1]){
                    return false;
                }
            }
            return true;
        }

        /**
         * Prints out an array with elements separated by the | symbol
         *
         * @param nums the array to be printed out
         */
        public static void printArray(int[] nums)
        {
            // DO NOT EDIT THIS METHOD
            for (int i = 0; i < nums.length; i++)
            {
                if (i == 0)
                {
                    System.out.println(nums[i]);
                }
                else
                {
                    System.out.println(" | " + nums[i]);
                }
            }
            System.out.println();
        }

        /**
         * Prints the elements of a double array on the same line, separated by the | symbol
         *
         * @param nums the array of numbers to be printed
         */
        public static void printArray(double[] nums)
        {
            //DO NOT EDIT THIS METHOD
            for (int i = 0; i < nums.length; i++)
            {
                if (i == 0)
                {
                    System.out.println(nums[i]);
                }
                else
                {
                    System.out.println(" | " + nums[i]);
                }
            }
            System.out.println();
        }
    }