## What is an Algorithm ?

Algorithm is a step-by-step procedure, which defines a set of instructions to be executed in a certain order to get the desired output. Algorithms are generally created independent of underlying languages, i.e. an algorithm can be implemented in more than one programming language.

## How it is different from a Program ?

- Algorithm are written at design time while Programs are written at implementation time.
- Algorithm can be wriiten in any language (for example a Mathematical Notation or Plain English)but a Program is writtem in a specific language.
- When you write an Algorithm, it is hardware and software system independent unlike a Program which relies on environment.

## Algorithm Analysis

Efficiency of an algorithm can be analyzed at two different stages, before implementation and after implementation. They are the following −

### Priori Analysis

This is a theoretical analysis of an algorithm which refers to its time and space complexity analysis using mathematical (algebraic) methods or using a theoritical model such as a finite state machine. (In short, analysis prior to running on real machine.) Efficiency of an algorithm is measured by assuming that all other factors, for example, processor speed, are constant and have no effect on the implementation.


### Posterior Analysis

This is an empirical analysis of an algorithm which refers to the statistical analysis of its space and time complexity after it is actualy run on a practical machine. (in short, the selected algorithm is implemented using programming language, then executed on target computer machine and analysed).

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
 
    
    for(int i=0; i<N; i=i*2){     
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
 
 so the loop stops when i >= N or 2^k >= N or k = Log N with base 2
 
 8.Time Complexity is O(Log N)
 
    
    for(int i=N; i>=1; i=i/2){     
          stmt;           
     }
     
   Assume i < 1 or n/2^k < 1 or n/2^k=1 or  k = Log n with base 2
   
 |i|
 |-|
 |N|
 |N/2|
 |N/4|
 |N/2^k|
 
  9.Time Complexity is O(root N)
 
    
    for(int i=0; i*i<N; i=++){     
          stmt;           
     }
     
 i^2 < N
 or i = root N
 
 10.Time Complexity is O(N)
 
    for(int i=0; i<N; i++){     --> executes N+1
      stmt;                     --> executes N
     }
     
     for(int j=0; j<N; j++){   --> executes N+1
      stmt;                     --> executes N
     }
     
  O(N+N)=O(N)
   
  11.Time Complexity is O(Log Log N)
  
    p=0
    for(int i=0; i<N; i=i*2){    
      p++;                   -->p = Log N
     }
     
     for(int j=0; j<p; j=j*2){   
      stmt;                     --> Log P(individual complexity)
     }
     
   O(Log Log N)
     
     
   12.Time Complexity is O(NLogN)
  
   
    for(int i=0; i<N; i++){      --> N
      for(int j=0; j<N; j=j*2){    --> N * LogN 
       stmt;                       --> N * LogN 
      }                  
     }
    
   O(NLogN)
   
   
## Summary 

  Loop  | Time Complexity | 
----|---|
| for(int i=0; i<N; i++)| O(N) |
| for(int i=N; i>0; i--) | O(N) | 
|for(int i=1; i<N; i=i+2) | O(N) | 
|for(int i=0; i<N; i=i*2) | O(Log N base 2) |
| for(int i=0; i<N; i=i*3) | O(Log N base 3) |
| for(int i=0; i<N; i=i/2) | O(Log N base 2) |

    
## Classes of Functions

O(1) --> Constant <br/>
O(Log N) --> Logarithmic <br/>
O(N) --> Linear <br/>
O(N^2) --> Quadratic <br/>
O(N^3) --> Cubic <br/>
O(2^N) --> Exponential <br/>

### Comparison
 1 < Log N < root N < N < N^2 < N^3 ----- 2^N < 3^N < N^N

## Asymtotic Analysis

Asymptotic Analysis is the big idea that handles above issues in analyzing algorithms. In Asymptotic Analysis, we evaluate the performance of an algorithm in terms of input size (we don’t measure the actual running time). We calculate, how does the time (or space) taken by an algorithm increases with the input size.

For example, let us consider the search problem (searching a given item) in a sorted array. One way to search is Linear Search (order of growth is linear) and other way is Binary Search (order of growth is logarithmic). To understand how Asymptotic Analysis solves the above mentioned problems in analyzing algorithms, let us say we run the Linear Search on a fast computer and Binary Search on a slow computer. For small values of input array size n, the fast computer may take less time. But, after certain value of input array size, the Binary Search will definitely start taking less time compared to the Linear Search even though the Binary Search is being run on a slow machine. The reason is the order of growth of Binary Search with respect to input size logarithmic while the order of growth of Linear Search is linear. So the machine dependent constants can always be ignored after certain values of input size.

The main idea of asymptotic analysis is to have a measure of efficiency of algorithms that doesn’t depend on machine specific constants, and doesn’t require algorithms to be implemented and time taken by programs to be compared. Asymptotic notations are mathematical tools to represent time complexity of algorithms for asymptotic analysis. 

The following 3 asymptotic notations are mostly used to represent time complexity of algorithms.

__Big Oh__ --> Upper bound of a function <br />
__Big Omega__ --> Lower bound of a function <br />
__Theta__ --> Average bound of a function <br />

### Big Oh

   f(n)=O(g(n)) if c and b are positive constants
   such that f(n) <= c * g(n) for all n > b
   
   Example : f(n)=2n+3
             2n+3 <= ?
             suppose 2n+3 <= 10n for n > 1
             then f(n)= O(n) where g(n) = n and c = 10 for all n > 1
             
   also 2n+3 <= 2n^2+3n^2 then f(n)= O(n^2)
   
   f(n) belongs to the function of class N below
   
 1 < Log N < root N < N < N^2 < N^3 ----- 2^N < 3^N < N^N <br />
 --->Lower Bound<--average--------->Upper Bound<----------
 
 
### Big Omega
 
  f(n)= Omega(g(n)) if c and b are positive constants
  such that f(n) >= c * g(n) for all n > b
   
### Theta
  
  f(n)= Theta(g(n)) if c, c1 and b are positive constants
  such that c1 * g(n)<=f(n) >= c * g(n) for all n > b
  
  
## Comparison of function

Method 1 : Derive sample values

For Example -

n^2 vs n^3<br />
2^2 < 2^3
 
Obvioulsy n^3 is greater than n^2


Method 2 : Apply Log on both sides

__Helpul formulas__<br />
- Log ab = Log a + Log b <br />
- Log a/b = Log a - Log b <br />
- Log a^b = b Log a <br />
- a ^ Log b base c = b ^ Log a base c <br />
- a ^ n then b = Log N base a <br />

For Example -

f(n)=(n^2Logn) vs g(n)=n(Logn)^10<br />

Apply Log on both sides

Logn^2 + LogLogn vs Logn + Log(Logn)^10<br/>
or, 2Logn + LogLogN > Logn + 10Log(Logn) as LogLogn is smaller than LogN <br/>




## Algorithm Design Techniques

The following is a list of several popular design approaches:

 - __Divide and Conquer Approach__ : It is a top-down approach. The algorithms which follow the divide & conquer techniques involve three steps  (a) Divide the original problem into a set of subproblems. (b) Solve every subproblem individually, recursively. (c) Combine the solution of the subproblems (top level) into a solution of the whole original problem.

- __Greedy Technique__ : Greedy method is used to solve the optimization problem. An optimization problem is one in which we are given a set of input values, which are required either to be maximized or minimized (known as objective), i.e. some constraints or conditions. Greedy Algorithm always makes the choice (greedy criteria) looks best at the moment, to optimize a given objective. The greedy algorithm doesn't always guarantee the optimal solution however it generally produces a solution that is very close in value to the optimal.

- __Dynamic Programming__ : Dynamic Programming is a bottom-up approach we solve all possible small problems and then combine them to obtain solutions for bigger problems. This is particularly helpful when the number of copying subproblems is exponentially large. Dynamic Programming is frequently related to Optimization Problems.

- __Branch and Bound__ : In Branch & Bound algorithm a given subproblem, which cannot be bounded, has to be divided into at least two new restricted subproblems. Branch and Bound algorithm are methods for global optimization in non-convex problems. Branch and Bound algorithms can be slow, however in the worst case they require effort that grows exponentially with problem size, but in some cases we are lucky, and the method coverage with much less effort.

- __Randomized Algorithms__ : A randomized algorithm is defined as an algorithm that is allowed to access a source of independent, unbiased random bits, and it is then allowed to use these random bits to influence its computation.

- __Backtracking Algorithm__ : Backtracking Algorithm tries each possibility until they find the right one. It is a depth-first search of the set of possible solution. During the search, if an alternative doesn't work, then backtrack to the choice point, the place which presented different alternatives, and tries the next alternative.

- __Randomized Algorithm__ : A randomized algorithm uses a random number at least once during the computation make a decision.

## Divide And Conquer Strategy

Commom algorithms using this strategy are :

Binary Search
Finding Maximum and Minumum 
MergeSort 
Quick Sort 
Strassen's Matrix Multiplication

It uses recursive approach so we should how to write recursive code and how to analyze it for time and space complexity.

Lets see how to write a recurrence relation for a recursice code

                   void test(int n){
                    if(n>0){
                    print(n);     --> This consumes 1 or constant unit of time
                    test(n-1);
                    }
                   }
                   
 Assume test take T(n) time, so we can say T(n)=T(n-1)+1
 
 
 T(n) = T(n-1)+1 when n > 0 <br />
      = 1 when n = 0 <br />
 T(n) = T(n-2) + 1 + 1 <br />
 
 it the loop goes for k times then T(n)=T(n-k) + k, when k approches n then T(n) =T(n-n)+ n or, T(n)=1+n or, T(n) = O(n)
 
 We will see another example
 
                   void test(int n){  ----> T(n)
                    if(n>0){
                      for(int i=0;i<n;i=i*2){
                       print(n);     -----> Log n
                      test(n-1);     ----> T(n-1)
                      }
                    }
                   }
 
 
   T(n)<br />
 Log(n) + T(n-1)<br />
            Log(n-1) + T(n-2)<br />
                       Log(n-2) + T(n-3)<br />

 now the recurrence relation T(n)=T(n-1) + Log n <br />
 T(n)=T(n-2)+ Log(n-1)+ Log n<br />
 T(n)=T(n-k)+Log(n-k+1)+----+Log n
 when k approaches n <br />
 T(n) = T(0) + Log 1 +Log 2 + Log3 ----Log n
 T(n) = 1 + Log(1 * 2 * 3 * 4 --- * n)
 T(n) = 1 + Log(n!)
 
 we know that for n! the upper bound is n^n the for Log(n!) the time complexity will be O(nLogn)

Note : We are not considering the loop and condition check bacause even if you consider the the degree of the expression will be same as Log N i.e N(for condition) + (Log N +1)(for for loop) + Log N(for print)= 2Log N + 2 or, Log N
 
## Master Theorem

Many algorithms are recursive in nature. When we analyze them, we get a recurrence relation for time complexity. We get running time on an input of size n as a function of n and the running time on inputs of smaller sizes. For example in Merge Sort, to sort a given array, we divide it in two halves and recursively repeat the process for the two halves. Finally we merge the results. Time complexity of Merge Sort can be written as T(n) = 2T(n/2) + cn. There are many other algorithms like Binary Search, Tower of Hanoi, etc.

There are mainly three ways for solving recurrences : Substitution Method, Recurrence Tree Method and Master Method

Master Method is a direct way to get the solution. The master method works only for following type of recurrences or for recurrences that can be transformed to following type.

T(n) = aT(n/b) + f(n) where a >= 1 and b > 1

There are following three cases:

1. If f(n) = Θ(n^c) where c < Log a base b then T(n) = Θ(nLoga base b)

2. If f(n) = Θ(n^c) where c = Loga base b then T(n) = Θ(ncLog n)

3.If f(n) = Θ(n^c) where c > Loga base b then T(n) = Θ(f(n))

Examples of some standard algorithms whose time complexity can be evaluated using Master Method 

Merge Sort: T(n) = 2T(n/2) + Θ(n). It falls in case 2 as c is 1 and Logba] is also 1. So the solution is Θ(n Logn)

Binary Search: T(n) = T(n/2) + Θ(1). It also falls in case 2 as c is 0 and Logba is also 0. So the solution is Θ(Logn)

Notes: 

1) It is not necessary that a recurrence of the form T(n) = aT(n/b) + f(n) can be solved using Master Theorem. The given three cases have some gaps between them. For example, the recurrence T(n) = 2T(n/2) + n/Logn cannot be solved using master method.
      
 



