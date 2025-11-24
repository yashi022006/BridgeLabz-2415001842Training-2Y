import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {

        
        Map<String, Integer> votes = new HashMap<>();

        
        String[] castedVotes = {
            "Alice", "Bob", "Alice", "Charlie", "Alice",
            "Bob", "Charlie", "Charlie", "Bob", "Alice"
        };

        
        for (String candidate : castedVotes) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        System.out.println("Total Votes per Candidate:");
        for (var entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        
        String winner = null;
        int maxVotes = -1;

        for (var entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        
        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes!");
    }
}
