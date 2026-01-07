import java.util.*;

public class DataStructuresPractice {

    // ---------- Arrays ----------
    private static void arraysDemo() {
        System.out.println("\n--- Arrays Demo ---");
        int[] nums = {5, 2, 9, 1, 5, 6};

        System.out.println("Original: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Sorted:   " + Arrays.toString(nums));

        int target = 5;
        int count = 0;
        for (int n : nums) {
            if (n == target) count++;
        }
        System.out.println("Count of " + target + ": " + count);
    }

    // ---------- ArrayList ----------
    private static void arrayListDemo() {
        System.out.println("\n--- ArrayList Demo ---");
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Study");
        tasks.add("Workout");
        tasks.add("Code");

        System.out.println("Tasks: " + tasks);

        tasks.remove("Workout");
        tasks.add("Read");
        System.out.println("Updated Tasks: " + tasks);

        System.out.println("Looping tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ") " + tasks.get(i));
        }
    }

    // ---------- HashMap ----------
    private static void hashMapDemo() {
        System.out.println("\n--- HashMap Demo ---");
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Jonathan", 95);
        scores.put("Alex", 88);
        scores.put("Maria", 91);

        System.out.println("Scores: " + scores);

        String student = "Alex";
        System.out.println(student + "'s score: " + scores.get(student));

        // Update a value
        scores.put("Alex", 90);
        System.out.println("Updated Scores: " + scores);
    }

    // ---------- HashSet ----------
    private static void hashSetDemo() {
        System.out.println("\n--- HashSet Demo ---");
        HashSet<String> seen = new HashSet<>();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "pear"};

        for (String w : words) {
            if (!seen.add(w)) {
                System.out.println("Duplicate found: " + w);
            }
        }

        System.out.println("Unique words: " + seen);
    }

    // ---------- Stack ----------
    private static void stackDemo() {
        System.out.println("\n--- Stack Demo ---");
        Stack<Character> stack = new Stack<>();
        String text = "hello";

        for (char c : text.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }

    // ---------- Queue ----------
    private static void queueDemo() {
        System.out.println("\n--- Queue Demo ---");
        Queue<String> line = new ArrayDeque<>();
        line.add("Person A");
        line.add("Person B");
        line.add("Person C");

        System.out.println("Line: " + line);
        System.out.println("Serving: " + line.poll());
        System.out.println("Next: " + line.peek());
        System.out.println("Line after serving: " + line);
    }

    // ---------- Simple Algorithm: Linear Search ----------
    private static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // ---------- Simple Algorithm: Frequency Counter ----------
    private static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    private static void algorithmsDemo() {
        System.out.println("\n--- Algorithms Demo ---");

        int[] arr = {10, 20, 30, 40, 50};
        int x = 40;
        int idx = linearSearch(arr, x);
        System.out.println("Linear search for " + x + " in " + Arrays.toString(arr) + " => index " + idx);

        String sample = "mississippi";
        System.out.println("Char frequency for \"" + sample + "\": " + charFrequency(sample));
    }

    public static void main(String[] args) {
        System.out.println("=== Basic Data Structures Practice (Java) ===");

        arraysDemo();
        arrayListDemo();
        hashMapDemo();
        hashSetDemo();
        stackDemo();
        queueDemo();
        algorithmsDemo();

        System.out.println("\nDone!");
    }
}
