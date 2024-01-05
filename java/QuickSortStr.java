import java.util.Scanner;

public class QuickSortStr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of names from the user
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();

        // Get the names from the user
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        // Perform quicksort
        quickSort(names, 0, n - 1);

        // Print the sorted names
        System.out.println("\nSorted Names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }

    // Quicksort algorithm
    private static void quickSort(String[] names, int low, int high) {
        if (low < high) {
            int pi = partition(names, low, high);

            quickSort(names, low, pi - 1);
            quickSort(names, pi + 1, high);
        }
    }

    // Partitioning step of quicksort
    private static int partition(String[] names, int low, int high) {
        String pivot = names[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (names[j].compareTo(pivot) <= 0) {
                i++;
                String temp = names[i];
                names[i] = names[j];
                names[j] = temp;
            }
        }
        String temp = names[i + 1];
        names[i + 1] = names[high];
        names[high] = temp;

        return i + 1;
    }
}
/*
OUTPUT
Enter the number of names: 5
Enter name 1: joseph
Enter name 2: alisha
Enter name 3: sid
Enter name 4: william
Enter name 5: john

Sorted Names:
alisha
john
joseph
sid
william
*/

	
