public class Table
{
    public static void main(String[] args)
    {
        // Create arrays for each number in the table
        int[] ones = {1,2,3,4,5,6,7,8,9,10};
        int[] twos = {2,4,6,8,10,12,14,16,18,20};
        int[] threes = {3,6,9,12,15,18,21,24,27,30};
        int[] fours = {4,8,12,16,20,24,28,32,36,40};
        int[] fives = {5,10,15,20,25,30,35,40,45,50};
        int[] sixes = {6,12,18,24,30,36,42,48,54,60};
        int[] sevens = {7,14,21,28,35,42,49,56,63,70};
        int[] eights = {8,16,24,32,40,48,56,64,72,80};
        int[] nines = {9,18,27,36,45,54,63,72,81,90};
        int[] tens = {10,20,30,40,50,60,70,80,90,100};

        // Creates 2D array with all the 1d arrays as rows and the index values as columns
        int[][] table = { ones, twos, threes, fours, fives, sixes, sevens, eights, nines, tens };


        // Nested loop to iterate through the table and then iterate through the 1d array
        // System.outs the lines to have a traditional times table structure
        // Last System.out prints a new line between arrays creating the rows
        // \t is an Escape Sequence that performs a tab stop, creates equal spacing in the table
        for ( int i = 0; i < table.length; i++) {
            for ( int x = 0; x < table[i].length; x++){
                System.out.print(table[i][x] + "\t");
            }
            System.out.println();
        }
    }
}