import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static List<String> getPermutation(List<String> items, BigInteger k) {
        List<String> result = new ArrayList<>();
        List<String> temp = new ArrayList<>(items);
        int n = temp.size();
        BigInteger[] fact = new BigInteger[n + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }

        BigInteger rem = k;
        for (int i = n; i >= 1; i--) {
            BigInteger[] div = rem.divideAndRemainder(fact[i - 1]);
            int idx = div[0].intValue();
            result.add(temp.remove(idx));
            rem = div[1];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> labels = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            labels.add(sc.next());
            weights.add(sc.nextInt());
        }
        int kInput = sc.nextInt();
        BigInteger k = BigInteger.valueOf(kInput - 1);

        long baseCost = 0;
        for (int i = 0; i < n; i++) {
            baseCost += (long) weights.get(i) * (i + 1);
        }

        Map<String, Integer> totalWeight = new HashMap<>();
        for (int i = 0; i < n; i++) {
            totalWeight.put(labels.get(i), totalWeight.getOrDefault(labels.get(i), 0) + weights.get(i));
        }

        Map<Integer, List<String>> weightGroups = new HashMap<>();
        for (Map.Entry<String, Integer> entry : totalWeight.entrySet()) {
            weightGroups.computeIfAbsent(entry.getValue(), x -> new ArrayList<>()).add(entry.getKey());
        }

        List<Integer> sortedWeights = new ArrayList<>(weightGroups.keySet());
        Collections.sort(sortedWeights, Collections.reverseOrder());

        List<List<String>> blocks = new ArrayList<>();
        for (int w : sortedWeights) {
            List<String> block = weightGroups.get(w);
            Collections.sort(block);
            blocks.add(block);
        }

        long totalCost = baseCost;
        int position = 1;
        for (int w : sortedWeights) {
            List<String> block = weightGroups.get(w);
            for (String s : block) {
                totalCost += (long) w * position;
                position++;
            }
        }

        List<BigInteger> factorials = new ArrayList<>();
        for (List<String> block : blocks) {
            factorials.add(factorial(block.size()));
        }

        int m = blocks.size();
        BigInteger[] suffix = new BigInteger[m];
        BigInteger prod = BigInteger.ONE;
        for (int i = m - 1; i >= 0; i--) {
            suffix[i] = prod;
            prod = prod.multiply(factorials.get(i));
        }

        List<String> answer = new ArrayList<>();
        BigInteger rem = k;
        for (int i = 0; i < m; i++) {
            List<String> block = blocks.get(i);
            BigInteger[] div = rem.divideAndRemainder(suffix[i]);
            BigInteger idx = div[0];
            rem = div[1];
            answer.addAll(getPermutation(block, idx));
        }

        System.out.println(totalCost);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            if (i != answer.size() - 1) sb.append(" ");
        }
        System.out.println(sb.toString());

        sc.close();
    }
}
