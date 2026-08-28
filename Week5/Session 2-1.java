import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> maxSubarray(List<Integer> arr) {

        // Kadane's Algorithm for maximum contiguous subarray sum
        int currentSum = arr.get(0);
        int maxSum = arr.get(0);

        // Maximum subarray sum
        for (int i = 1; i < arr.size(); i++) {
            currentSum = Math.max(arr.get(i), currentSum + arr.get(i));

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        // Maximum non-contiguous subarray sum
        int nonContiguousSum = 0;
        int largestElement = arr.get(0);

        for (int value : arr) {
            if (value > 0) {
                nonContiguousSum += value;
            }

            if (value > largestElement) {
                largestElement = value;
            }
        }

        // If all elements are negative, choose the largest element
        if (nonContiguousSum == 0) {
            nonContiguousSum = largestElement;
        }

        return Arrays.asList(maxSum, nonContiguousSum);
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH"))
            );

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {
                int n = Integer.parseInt(
                    bufferedReader.readLine().trim()
                );

                List<Integer> arr = Stream.of(
                        bufferedReader.readLine()
                            .replaceAll("\\s+$", "")
                            .split(" ")
                    )
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result =
                    Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}


Input (stdin)
2
4
1 2 3 4
6
2 -1 2 3 4 -5
Your Output (stdout)
10 10
10 11
Expected Output
10 10
10 11
