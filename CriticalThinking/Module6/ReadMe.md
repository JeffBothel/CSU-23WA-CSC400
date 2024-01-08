# Module 6 Critical Thinking Exercise

This module asked for the student to compile a program based on the following prompt:

*Devise an algorithm that detects whether a given array is sorted into ascending order. Write a Java method that implements your algorithm. You can use your method to test whether a sort method has executed correctly.*

The following are the points that I am seeing as needed from the prompt
* Determine the sorting of an array
* Should test if a sorting algorithm operated effectively
* The program needs to be efficient

## Psuedocode for Program
```
method boolean SortAscTest(int[] array)
    boolean isSorted = true
    for(i , i < array.length, i++)
        if(array[i+1] < array[i])
            isSorted = false
            break
    return isSorted
```