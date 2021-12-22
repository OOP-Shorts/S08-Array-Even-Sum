public class ArrayEvenSum {

    /* Schreiben Sie eine Methode, die ein int[] als Parameter übergeben bekommt, und alle durch zwei teilbaren Werte aufaddiert und das Ergebnis zurückgibt.*/
    public static int intArrayEvenSum(int[] values) {
        return 0;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 5, 7, 8, 9, 101, 6, 3, 4};
        int testSum = intArrayEvenSum(testArray);

        if(testSum == 20) {
            System.out.print("Correct!");
        } else {
            System.out.println("Your solution was " + testSum + " but 20 is correct.");
        }
    }
}
