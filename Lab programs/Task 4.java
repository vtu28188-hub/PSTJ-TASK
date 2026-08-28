public class IntelligentDNAPatternSearch {

    public static int search(String text, String pattern) {

        if (pattern.length() == 0) {
            return 0;
        }

        int[] lps = buildLPS(pattern);

        int i = 0;
        int j = 0;

        while (i < text.length()) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == pattern.length()) {
                    return i - j;
                }

            } else if (j > 0) {
                j = lps[j - 1];

            } else {
                i++;
            }
        }

        return -1;
    }

    private static int[] buildLPS(String pattern) {

        int[] lps = new int[pattern.length()];

        int len = 0;
        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i] = ++len;
                i++;

            } else if (len > 0) {
                len = lps[len - 1];

            } else {
                lps[i] = 0;
                i++;
            }
        }

        return lps;
    }

    public static void main(String[] args) {

        String dna = "ACGTACGTGAC";
        String pattern = "GTG";

        System.out.println(search(dna, pattern));
    }
}




output
  6

output
