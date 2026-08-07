 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            deque.addLast(num);
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (deque.size() > m) {
                int removed = deque.removeFirst();
                map.put(removed, map.get(removed) - 1);
                if (map.get(removed) == 0) {
                    map.remove(removed);
                }
            }

            if (deque.size() == m) {
                max = Math.max(max, map.size());
            }
        }

        System.out.println(max);
    }
}


6 3
5 3 5 2 3 2
Expected Output
3




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
HashSet<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + "#" + pair_right[i]);
            System.out.println(set.size());
        }

        s.close();
    

   }
}



5
john tom
john mary
john tom
mary anna
mary anna
Your Output (stdout)
1
2
2
3
3
Expected Output
1
2
2
3
3


