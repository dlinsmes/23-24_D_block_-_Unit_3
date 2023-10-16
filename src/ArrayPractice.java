public class ArrayPractice {
    public static void main(String [] args) {

        //declare a string array called names that
        //holds 4 values
        String [] names = new String [4];

        //indexing (positioning) starts at 0
        names[0] = "greta";
        names[1] = "jackson";
        names[2] = "zach";
        names[3] = "jonah";

        System.out.println("value at index 2 is " + names[2]);

        //this prints the memory location - not useful
        System.out.println(names);

        //iterate i through all indices in names
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();


        //for-each loops aka enhanced for loops
        //iterate through all values in the array sequentially
        //"for each String n in the array names"
        //-n is a value from the array, NOT an index
        //-you should know how to read for-each loops,
        //but you're not required to write them
        for (String n: names) {
            System.out.print(n + " ");
        }
        System.out.println();

        //use for-each loops when you don't need indexing
        //and you want to go through each value in order

        //for-each loops can't set/change values in the array
        for (String n: names) {
            //n is a temporary variable that won't change the
            //original array value
            n = "batman";
        }

        for (String n: names) {
            System.out.print(n + " ");
        }
        System.out.println();

        //can use regular for loops to change/set values
        for (int i = 0; i < names.length; i++)
            names[i] = "batman";

        for (String n: names) {
            System.out.print(n + " ");
        }
        System.out.println();

        int [] nums = {5, 3, 4, 5, 1, 6, 4, 2, 4};

        //can only initialize values like this at the declaration step
//        names = {"fsdfsad"};
        String [] words = {"something", "something else"};

        //data type of for-each loop variable needs to match
        //the array type
        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //count and output how many 4s are in nums
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                count++;
            }
        }
        System.out.println("number of 4s: " + count);

        count = 0;
        //IMPORTANT - n is a value fromt the array, NOT an index
        for(int n: nums) {
            if (n == 4)
                count++;
        }
        System.out.println("number of 4s: " + count);

        //be careful to mix up array values with array indices

        //swap the first and last values in the array
        //(5 at index 0 and 4 at index length-1)

        int temp = nums[0];
        nums[0] = nums[ nums.length-1 ];
        nums[ nums.length-1 ] = temp;

        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //sorting algorithms - selection sort
        //moving from left to right, build the sorted section on the left
        //by finding the smallest value in the unsorted section (on right).
        //when the smallest value is found, swap it into position at the
        //next place in the sorted section

        //i is the index that we want to swap the next smallest value to
        for (int i = 0; i < nums.length; i++) {

            //track the index of the next smallest value that comes
            //after position i
            int nextSmallestI = i;

            //start AFTER the current i value bc everything before it
            //is guaranteed to be smaller and already sorted
            for (int j = i+1; j < nums.length; j++) {

                //check if the value at position j is smaller than
                //the value at position nextSmallestI
                //-if so, update nextSmallestI

                //comparison sign controls increasing or decreasing order
                if(nums[j] < nums[nextSmallestI]) {
                    nextSmallestI = j;
                }
            }

            //swap AFTER the inner loop to move the smallest value into
            //position i

            int swap = nums[i];
            nums[i] = nums[nextSmallestI];
            nums[nextSmallestI] = swap;

            for (int n: nums)
                System.out.print(n + " ");
            System.out.println();

        }

        //for sorting - know the general concepts and steps
        //-don't need to memorize the code
        //-know how to read and interpret the code if provided





    }

}
