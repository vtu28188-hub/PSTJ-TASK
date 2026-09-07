import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dna = sc.nextLine();
        String pattern = sc.nextLine();

        dna = dna.toUpperCase();
        pattern = pattern.toUpperCase();

        int count = 0;

        if (pattern.length() <= dna.length()) {
            for (int i = 0; i <= dna.length() - pattern.length(); i++) {

                boolean match = true;

                for (int j = 0; j < pattern.length(); j++) {
                    if (dna.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    count++;
                }
            }
        }

        System.out.println("Pattern found " + count + " times.");

        sc.close();
    }
}



Enter DNA Sequence: ATGCGATGATG
Enter pattern : ATG
Pattern found 3 times
