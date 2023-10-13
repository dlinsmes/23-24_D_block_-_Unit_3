import java.util.Scanner;
public class Arrays {

    public static void main(String [] args) {

        String word = "pineapple";

        //length is the number of chars in a string
        System.out.println(word.length());

        //substring - give you a part of a string that you
        //indicate by index (position)
        //indexing starts at 0

        //substring with one number - give the part of the
        //string that starts at the provided index and goes
        //until the end of the string
        System.out.println(word.substring(4));

        //substring with two numbers indicate the beginning
        //index and the ending (exclusive) index
        //substring(1,4) gives us the chars at indices 1, 2, and 3
        System.out.println(word.substring(1, 4));

        //if you use an index that doesn't exist,
        //the program will crash with an index out of bounds error
        //System.out.println(word.substring(20));

        //isolate just one char using consecutive indices
        System.out.println(word.substring(0, 1));

        //nothing prints bc the ending index is exclusive
        System.out.println(word.substring(3, 3));

        //use a for loop to print each letter of word
        //on its own line
        for (int i = 0; i < word.length(); i++) {
            //use i to iterate through all indices
            //i+1 will be one more than i to isolate just one letter
            System.out.println(word.substring(i, i+1));
        }

        //array - hold multiple values to a single variable name
        //(like a list, but the size is predefined and the number
        //of values can't exceed that size)
        //-refer to each value (element) by an index (position)
        //-indexing begins at 0

        //declare a String array called words and initialize its
        //size/length/capacity to 4 - it can hold 4 values
        //since length is 4, possible indices are 0-3
        String [] words = new String [4];

        words[0] = "pajamas";
        words[1] = "paper";
        //words[2] = "scissors";
        words[3] = "car";

        System.out.println("the element at index 1 is " + words[1]);

        //invalid index - out of bounds error
        //System.out.println(words[4]);

        //an array length is its capacity - how many elements it holds
        System.out.println(words.length);

        System.out.println("the value at index 2 is " + words[2]);

        //if an array value isn't initialized, it defaults to
        //String: null (nothing)
        //int: 0
        //double: 0.0
        //boolean: false

        String word2;
        //uninitialized values will only default in arrays, not
        //single-value variables
        //System.out.println(word2);

        //this will print the memory location of the array
        //(not useful)
        System.out.println(words);

        //to print a whole array, print each value by specifying an index

        //use a loop to iterate through valid indices of the array
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        //if you know the initial values, you can initialize like:
        int [] nums = { 12, 4, 8, 9, 22, 102323 }; //length is 6
        System.out.println("value at index 1 is " + nums[1]);

        //die roll problem using an array
        int [] count = new int [6];
        System.out.println(count[4]); //values will default to 0
        //{count of 1s, count of 2s, ... , count of 6s}
        //count of 1s will be at index 0

        for (int i = 0; i < 1000000; i++) {
            int roll = (int)(Math.random() * 6 + 1);
            //turn the roll result into an index starting at 0
            count[roll-1]++;
        }

        for (int i = 0; i < count.length; i++) {
            //i+1 turns index number into roll result for output
            System.out.println("Number of " + (i+1) + "s: " + count[i]);
        }

        int [] nums2 = new int[20];
        //assign random numbers [1, 10] to each position in nums2
        for (int i = 0; i < nums2.length; i++) {
            int random = (int)(Math.random()* 10 + 1);
            nums2[i] = random;
            //same as nums2[i] = (int)(Math.random()* 10 + 1);

            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        //ask the user for how many items they have to add to their
        //shopping cart, then ask for each item to add, then print
        //the whole cart
        Scanner s = new Scanner(System.in);
        System.out.println("how many items are you adding?");
        int numItems = s.nextInt();
        s.nextLine();

        //length depends on user input
        String [] cart = new String[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.println("what are you adding?");
            cart[i] = s.nextLine();
        }

        for (int i = 0; i < cart.length; i++) {
            System.out.println(i + " - " + cart[i]);
        }

        //keep asking the user for the index of the item
        // they want printed
        //pr they can enter -1 to stop

        System.out.println("enter the index of the item you want or -1 to stop");
        int index = s.nextInt();

        while(index != -1) {
            System.out.println(cart[index]);


            System.out.println("enter the index of the item you want or -1 to stop");
            index = s.nextInt();
        }

    }
}
