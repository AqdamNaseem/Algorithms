## What is an Algorithm ?

Algorithm is a step-by-step procedure, which defines a set of instructions to be executed in a certain order to get the desired output. Algorithms are generally created independent of underlying languages, i.e. an algorithm can be implemented in more than one programming language.

## How it is different from a Program ?

- Algorithm are written at design time while Programs are written at implementation time.
- Algorithm can be wriiten in any language (for example a Mathematical Notation or Plain English)but a Program is writtem in a specific language.
- When you write an Algorithm, it is hardware and software system independent unlike a Program which relies on environment.

## Algorithm Analysis

Efficiency of an algorithm can be analyzed at two different stages, before implementation and after implementation. They are the following −

| Priori Analysis | Posterior Analysis |
|-----------------|--------------------|
|This is a theoretical analysis of an algorithm which refers to its time and space complexity analysis using mathematical (algebraic) methods or using a theoritical model such as a finite state machine. (In short, analysis prior to running on real machine.)Efficiency of an algorithm is measured by assuming that all other factors, for example, processor speed, are constant and have no effect on the implementation.|This is an empirical analysis of an algorithm which refers to the statistical analysis of its space and time complexity after it is actualy run on a practical machine. (in short, the selected algorithm is implemented using programming language, then executed on target computer machine and analysed).In this analysis, actual statistics like running time and space required, are collected.|

## Algorithm Complexity

Suppose X is an algorithm and n is the size of input data, the time and space used by the algorithm X are the two main factors, which decide the efficiency of X.

__Time Factor__ − Time is measured by counting the number of key operations such as comparisons in the sorting algorithm.

__Space Factor__ − Space is measured by counting the maximum memory space required by the algorithm.

The complexity of an algorithm f(n) gives the running time and/or the storage space required by the algorithm in terms of n as the size of input data.

## Asymtotic Analysis


## Algorithm Design Techniques

The following is a list of several popular design approaches:

 1. __Divide and Conquer Approach__ : It is a top-down approach. The algorithms which follow the divide & conquer techniques involve three steps:

- Divide the original problem into a set of subproblems.
- Solve every subproblem individually, recursively.
- Combine the solution of the subproblems (top level) into a solution of the whole original problem.

2. __Greedy Technique__ : Greedy method is used to solve the optimization problem. An optimization problem is one in which we are given a set of input values, which are required either to be maximized or minimized (known as objective), i.e. some constraints or conditions.

Greedy Algorithm always makes the choice (greedy criteria) looks best at the moment, to optimize a given objective.
The greedy algorithm doesn't always guarantee the optimal solution however it generally produces a solution that is very close in value to the optimal.

3. __Dynamic Programming__ : Dynamic Programming is a bottom-up approach we solve all possible small problems and then combine them to obtain solutions for bigger problems.

This is particularly helpful when the number of copying subproblems is exponentially large. Dynamic Programming is frequently related to Optimization Problems.

4. __Branch and Bound__ : In Branch & Bound algorithm a given subproblem, which cannot be bounded, has to be divided into at least two new restricted subproblems. Branch and Bound algorithm are methods for global optimization in non-convex problems. Branch and Bound algorithms can be slow, however in the worst case they require effort that grows exponentially with problem size, but in some cases we are lucky, and the method coverage with much less effort.

5. Randomized Algorithms: A randomized algorithm is defined as an algorithm that is allowed to access a source of independent, unbiased random bits, and it is then allowed to use these random bits to influence its computation.

6. Backtracking Algorithm: Backtracking Algorithm tries each possibility until they find the right one. It is a depth-first search of the set of possible solution. During the search, if an alternative doesn't work, then backtrack to the choice point, the place which presented different alternatives, and tries the next alternative.

7. __Randomized Algorithm__ : A randomized algorithm uses a random number at least once during the computation make a decision.

Example :

__Insertion sort__
- Design approach : Incremental
- Sorts in place : Yes
- Best Case : O(N)
- Worst case : O(N^2)

__Bubble Sort__
◦ Design approach : Incremental
◦ Sorts in place :Yes
◦ Running time : O(N^2)

__Selection sort__
◦ Design approach : Incremental
◦ Sorts in place : Yes
◦ Running time : O(N^2)

__Merge sort__
- Design approach : Divide and Conquer
- Sorts in place : No 
- Running time : O(N Log N)


