# Comparison of Sorting Algorithms

|Size|Bubble|Selection|Insertion|Merge|Quick|
|----|------|---------|---------|-----|-----|
|10000|268337|172188|112927|1354	|1251|
|20000|1153151|698674|461337|3266|2167|
|30000|2608569|1500900|1003081|5153|3622|
|40000|4616671|2678436|1736024|7259|5162|
|50000|7256359	4331037|2885653|8673|6439|
|60000|10316054|5965544|4086762|13304|8664|
|70000|14760440|8406086|5481356|13352|9916|
|80000|18946896|10907601|6936996|13933|11119|
|90000|24215815|13973373|9193457|16549|12253|
|100000|30075729|17215122|11014322|18453|12940|

Note : Time is in milliseconds

<p align="center">
<img src="https://github.com/AqdamNaseem/Algorithms/blob/master/Sorting/images/Sorting_Algorithm_Comparison.png" >
</p>

Note : A sorting algorithm is said to be stable if and only if two records R and S with the same key and with R appearing before S in the original list, R must appear before S in the sorted list.

## Bubble Sort

- Design approach : Incremental
- Sorts in place : Yes
- Stable : Yes
- Average : О(n^2)
- Worst : О(n^2)
- Best : О(n)

Note : The majority of O(N^2) algorithms outperform bubble sort

## Selection Sort

- Design approach : Incremental
- Sorts in place : Yes
- Stable : No 
- Running time : O(n^2)

## Insertion Sort

- Design approach : Incremental
- Sorts in place : Yes
- Stable : Yes 
- Average : О(n^2)
- Worst : О(n^2)
- Best : О(n)

## Merge Sort

- Design approach : Divide and Conquer
- Sorts in place : No
- Stable : Yes 
- Running time : O(nLogn)

## Quick Sort

- Design approach : Divide and Conquer
- Sorts in place : Yes
- Stable : No 
- Average : О(nLogn)
- Worst : О(n^2)
- Best : О(nLogn)
