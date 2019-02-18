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
|This is a theoretical analysis of an algorithm which refers to its time and space complexity analysis using mathematical (algebraic) methods or using a theoritical model such as a finite state machine. (In short, analysis prior to running on real machine.)Efficiency of an algorithm is measured by assuming that all other factors, for example, processor speed, are constant and have no effect on the implementation.|This is an empirical analysis of an algorithm which refers to the statistical analysis of its space and time complexity after it is actualy run on a practical machine. (in short, the selected algorithm is implemented using programming language, then executed on target computer machine and analysed).|

## Algorithm Complexity

Suppose X is an algorithm and n is the size of input data, the time and space used by the algorithm X are the two main factors, which decide the efficiency of X.

__Time Factor__ − Time is measured by counting the number of key operations such as comparisons in the sorting algorithm.
__Space Factor__ − Space is measured by counting the maximum memory space required by the algorithm.

The complexity of an algorithm f(n) gives the running time and/or the storage space required by the algorithm in terms of n as the size of input data.

## Common Time Complexities 
 
 1.Time Complexity is O(N) because the loop executes N times
 
    for(int i=0; i<N; i++){    --> executes N+1 times
     stmt;                     --> executes N times
    }
  
 2.Time Complexity is O(N) because the loop executes N times
 
    for(int i=N; i>0; i--){    --> executes N+1 times
     stmt;                     --> executes N times
    }
    
 3.Time Complexity is O(N)
 
    for(int i=1; i<N; i=i+2){   
     stmt;                     --> executes N/2 times
    }
    
 4.Time Complexity is O(N^2)
 
    for(int i=0; i<N; i++){     --> executes N+1
      for(int j=0; j<N; j++){   --> executes N*(N+1)
      stmt;                     --> executes N*N
      }
     }
  
 5.Time Complexity is O(N^2)
 
    for(int i=0; i<N; i++){     
      for(int j=0; j<i; j++){   
      stmt;                     
      }
     }
     
Lets trace it out

| i | j | No of Times stmt is executed |
----|---|-----------|
| 0| 0 | 0 |
| 0 | 0,1 | 1 |
|2 | 0,1,2 |  2 |
|3 | 0,1,2,3 | 3 |
| N | 0,1,2,3--N | N |

Total Time = 1+2+3+4+5+---N = N(N+1)/2 => O(N^2)

 6.Time Complexity is O(root N)
 
    p=0;
    for(int i=0; p<N; i++){     
          p=p+1;           
     }
 Its obvious that loop doesnot execute for N times, lets assume its execute for k times
   i | p | 
----|---|
| 1| 0+1 |
| 2 | 1+2 | 
|3 | 1+2+3 | 
|4 | 1+2+3+4 |
| k | 1+2+3+4---k |

so the loop stops when p > N or k*(k+1)/2 > N or k > root of N

 7.Time Complexity is O(Log N)
 
    p=0;
    for(int i=0; p<N; i=i*2){     
          stmt;           
     }
       
Lets assume the loop executes for k times

 |i|
 |-|
 |1|
 |1*2|
 |1*2^2|
 |1*2^3|
 |1*2^k|
 
 so the loop stops when i >= N or 2^k >= N or k = log N with base 2

## Classes of Functions

## Asymtotic Analysis


## Algorithm Design Techniques

The following is a list of several popular design approaches:

 - __Divide and Conquer Approach__ : It is a top-down approach. The algorithms which follow the divide & conquer techniques involve three steps  (a) Divide the original problem into a set of subproblems. (b) Solve every subproblem individually, recursively. (c) Combine the solution of the subproblems (top level) into a solution of the whole original problem.

- __Greedy Technique__ : Greedy method is used to solve the optimization problem. An optimization problem is one in which we are given a set of input values, which are required either to be maximized or minimized (known as objective), i.e. some constraints or conditions. Greedy Algorithm always makes the choice (greedy criteria) looks best at the moment, to optimize a given objective. The greedy algorithm doesn't always guarantee the optimal solution however it generally produces a solution that is very close in value to the optimal.

- __Dynamic Programming__ : Dynamic Programming is a bottom-up approach we solve all possible small problems and then combine them to obtain solutions for bigger problems. This is particularly helpful when the number of copying subproblems is exponentially large. Dynamic Programming is frequently related to Optimization Problems.

- __Branch and Bound__ : In Branch & Bound algorithm a given subproblem, which cannot be bounded, has to be divided into at least two new restricted subproblems. Branch and Bound algorithm are methods for global optimization in non-convex problems. Branch and Bound algorithms can be slow, however in the worst case they require effort that grows exponentially with problem size, but in some cases we are lucky, and the method coverage with much less effort.

- __Randomized Algorithms__ : A randomized algorithm is defined as an algorithm that is allowed to access a source of independent, unbiased random bits, and it is then allowed to use these random bits to influence its computation.

- __Backtracking Algorithm__ : Backtracking Algorithm tries each possibility until they find the right one. It is a depth-first search of the set of possible solution. During the search, if an alternative doesn't work, then backtrack to the choice point, the place which presented different alternatives, and tries the next alternative.

- __Randomized Algorithm__ : A randomized algorithm uses a random number at least once during the computation make a decision.

Example :

__Insertion sort__
- Design approach : Incremental
- Sorts in place : Yes
- Best Case : O(N)
- Worst case : O(N^2)

__Bubble Sort__
- Design approach : Incremental
- Sorts in place :Yes
- Running time : O(N^2)

__Selection sort__
- Design approach : Incremental
- Sorts in place : Yes
- Running time : O(N^2)

__Merge sort__
- Design approach : Divide and Conquer
- Sorts in place : No 
- Running time : O(N Log N)


