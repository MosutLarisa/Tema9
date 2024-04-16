import java.util.*;

public class Pairs {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.nextLine(); 

        Set<String> pairs = new HashSet<String>();
        List<Integer> pairCount = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            String[] pair = scanner.nextLine().split(" ");
            String key = pair[0] + " " + pair[1];
            pairs.add(key);
            pairCount.add(pairs.size());
        }

        for (Integer count : pairCount) {
            System.out.println(count);
        }
    }
}
