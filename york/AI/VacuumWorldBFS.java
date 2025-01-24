import java.util.ArrayList;
import java.util.List;

public class VacuumWorldBFS {
    
    // For this example, we'll define the "goal states" as states 7 and 8,
    // which represent "no dirt on either side" with the vacuum in either Left or Right.
    private static final List<Integer> GOAL_STATES = List.of(7, 8);

    // The transitions array maps each state (1..8) to the list of successor states.
    // For example, from the problem statement:
    //   State 1 -> [1, 2, 3]
    //   State 2 -> [1, 2, 6]
    //   State 3 -> [3, 4, 3]
    //   etc.
    // We'll store them in a 9-element array so that the index corresponds directly
    // to the state number (and index 0 will be unused).
    private static final int[][] TRANSITIONS = {
        {},          // Index 0 is unused
        {1, 2, 3},   // State 1
        {1, 2, 6},   // State 2
        {3, 4, 3},   // State 3
        {3, 4, 8},   // State 4
        {5, 5, 7},   // State 5
        {5, 6, 6},   // State 6
        {7, 7, 6},   // State 7
        {7, 8, 8}    // State 8
    };

    public static void main(String[] args) {
        // Our initial state is 1 (vacuum on left, dirt on both sides).
        int initialState = 1;
        
        // Check if the initial state is already a goal
        if (GOAL_STATES.contains(initialState)) {
            System.out.println("Initial state " + initialState + " is already a goal!");
            return;
        }
        
        // Frontier (FIFO queue) and Explored set
        ArrayList<Integer> frontier = new ArrayList<>();
        ArrayList<Integer> explored = new ArrayList<>();
        
        // Initialize the frontier with the initial state
        frontier.add(initialState);
        
        System.out.println("Starting BFS from state " + initialState);
        
        // BFS main loop
        while (!frontier.isEmpty()) {
            // Pop from the front of the queue
            int currentState = frontier.remove(0);
            
            // If we haven't yet explored it, explore now
            if (!explored.contains(currentState)) {
                explored.add(currentState);
                
                // Print which node we're expanding
                System.out.println("Expanding state " + currentState);
                
                // Check if this is a goal
                if (GOAL_STATES.contains(currentState)) {
                    System.out.println("Reached goal state: " + currentState);
                    return;
                }
                
                // Expand: get all successors of currentState
                int[] successors = TRANSITIONS[currentState];
                
                // Print the successors for debugging
                System.out.print("  Successors of " + currentState + " -> ");
                for (int s : successors) {
                    System.out.print(s + " ");
                }
                System.out.println();
                
                // Enqueue successors that are not explored and not in frontier
                for (int s : successors) {
                    if (!explored.contains(s) && !frontier.contains(s)) {
                        frontier.add(s);
                    }
                }
            }
        }
        
        // If we exhaust the frontier without finding a goal, report failure
        System.out.println("BFS terminated without finding a goal state.");
    }
}