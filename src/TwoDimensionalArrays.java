public class TwoDimensionalArrays {
    public static void main(String [] args) {

        //2d array - arrays can hold smaller arrays

        int [][] numbers = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12}};
        //use 2d arrays like grids

        //need two indices to refer to a specific value
        //first index for row (which subarray)
        //second index for which position within row (col)
        System.out.println("row 0 col 2 is " + numbers[0][2]);

        System.out.println("row 2 col 0 is " + numbers[2][0]);

        //a 2d array's length is the number of subarrays (rows)
        System.out.println("number of rows: " + numbers.length);

        //for num of cols - get the length of one of the subarrays
        //(use any valid row index)
        System.out.println("number of cols: " + numbers[0].length);

        //for APCSA - all 2d arrays are rectangular - all rows have same length
        //rows CAN have different lengths, but that will not come up this year

        //total: nRows* nCols
        System.out.println("total number of values: " + numbers.length * numbers[0].length);

        //print row at index 1
        System.out.println("row 1:");
        System.out.print(numbers[1][0] + " ");
        System.out.print(numbers[1][1] + " ");
        System.out.print(numbers[1][2] + " ");
        System.out.print(numbers[1][3] + " ");
        System.out.println();

        //for loop - use i to iterate through column index
        for (int i = 0; i < numbers[1].length; i++) {
            System.out.print(numbers[1][i] + " ");
        }
        System.out.println();

        //for-each loop - iterate through the subarray by indicating its row index
        //n will represent all the values in the subarray
        for (int n: numbers[1]) {
            System.out.print(n + " ");
        }
        System.out.println();


        //print column at index 2
        //-can't use for-each loop bc for-each loops will iterate through subarrays (rows)
        //-can't specify column with for-each

        System.out.println("col 2:");
        //length of the 2d array is the number of rows, same as how many values are in a col
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][2] + " ");
        }
        System.out.println();
        System.out.println();

        // print whole 2d array as grid
        //-need nested loops

        //outer loop - iterate through each row
        for (int i = 0; i < numbers.length; i++) {

            //inner loop - iterate through the values within the row
            for (int j = 0; j < numbers[i].length; j++) {
                //\t is a tab character - for consistent column spacing
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        //for-each loops:

        //-outer loop - each row is a 1D int array
        for (int [] row: numbers) {
            for (int n: row) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }

        String [] names = {"beth", "steve", "bill"};
        String [] subjects = {"gaming", "english", "math", "magic"};

        //2d int array that holds the grades that each name receives in each subject
        //each row will represent a name
        //each col will represent a subject

        //initialize a 2d array to have specific dimensions - give the row length and col length
        int [][] grades = new int[3][4];

        grades[0][0] = 90;
        grades[0][1] = 95;
        grades[0][2] = 90;
        grades[0][3] = 78;

        grades[1][0] = 100;
        grades[1][1] = 92;
        grades[1][2] = 4;
        grades[1][3] = 86;

        grades[2][0] = 98;
        grades[2][1] = 103;
        grades[2][2] = 89;
        grades[2][3] = 86;

        System.out.println("grades: ");

        for (int i = 0; i < grades.length; i++) {

            System.out.print(names[i] + "\t");

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }

        //calculate and print each student's avg across their 4 classes - row avgs

        for (int i = 0; i < grades.length; i++) {
            int sum = 0;
            //add all values (grades) in the row
            for (int j = 0; j < grades[0].length; j++) {
                sum = sum + grades[i][j];
            }
            int avg = sum / grades[0].length;
            System.out.println(names[i] + "'s avg: " + avg);
        }



        //calculate avg grade of each subject - col avgs
        //swap inner and outer loops
        //=check/change the quantity of values to divide by for calculating avg

        for (int j = 0; j < grades[0].length; j++) {

            int sum = 0;
            //add all values (grades) in the row
            for (int i = 0; i < grades.length; i++) {

                sum = sum + grades[i][j];
            }
            int avg = sum / grades.length;
            System.out.println(subjects[j] + "'s avg: " + avg);
        }








    }
}
