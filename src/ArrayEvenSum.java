public class ArrayEvenSum {

    /* Schreiben Sie eine Methode, die ein int[] als Parameter übergeben bekommt, und alle durch zwei teilbaren Werte aufaddiert und das Ergebnis zurückgibt.*/
    public static int intArrayEvenSum(int[] values) {
        // Falls ein leeres Array übergeben wird, wird 0 zurückgegeben.
        if(values == null || values.length == 0) {
            return 0;
        }

        int sum = 0;

        // Das genze Array wird mit einer for-Schleife durchgegangen.
        for (int i = 0; i < values.length; i++) {
            // Falls eine Zahl durch zwei teilbar ist liefert die Division durch 2 den Rest 0
            if(values[i] % 2 == 0) {
                // Durch zwei teilbare Zahlen werden auf sum addiert.
                sum += values[i];
            }
        }

        return sum;
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
