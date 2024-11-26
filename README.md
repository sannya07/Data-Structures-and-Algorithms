This repository is dedicated to mastering Data Structures and Algorithms (DSA) in Java. My goal is to cover a wide range of topics, including all major patterns and as many questions as I can modify or solve, focusing on both theory and practical implementation.

-Subsequences and Backtracking:
In subsequence problems, we often use backtracking by either including or excluding elements at each step. Handling edge cases properly is crucial to solving these problems effectively. This technique allows us to explore all possible subsequences and evaluate them based on the problem requirements.

-Combinations:
Combinations are similar to subsequences but with a key difference: in combinations, we can allow duplicate elements to appear more than once. This requires a slight modification to the backtracking process where we need to control element repetition when generating combinations.

-Graphs:
  - Input: We can take input by using adjacencyList(Graphs_02) and adjacencyMatrix(Graphs_01).
  - Traversals: There are 2 ways in which a graph can be traversed (1) BreadthFirstSearch(BFS.java) (2)     DepthFirstSearch(DFS.java)
  - Number of provinces: We used the approach of traversals, Each time you start a DFS/BFS from an unvisited   node, it indicates that you have found a new connected component (province). You increment the province count each time this happens. This is also a leetcode question https://leetcode.com/problems/number-of-provinces/description/

-DP: Dynamic Programming (DP) is an optimization technique used to solve problems with overlapping subproblems and optimal substructure properties. Instead of solving the same subproblem repeatedly, DP stores the results of subproblems to reuse them, making the algorithm efficient.

  
