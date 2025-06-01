public class AscendingOrder {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 numbers as command line arguments.");
            return;
        }

        int[] numbers = new int[5];

        // Convert command line arguments to integers
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Sort the array using simple Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted numbers
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
