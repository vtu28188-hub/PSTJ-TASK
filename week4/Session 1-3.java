import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: "
                            + arr[i] + " + " + arr[j]
                            + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}





Enter number of elements: 4
Enter elements:
1
2
3
4
Enter target: 3
Pair found: 1 + 2 = 3


v
