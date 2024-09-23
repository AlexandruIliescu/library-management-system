Create a program that calculates the sum of squares of a large array of integers. Your solution should include two approaches:

- Single-threaded: Calculate the sum using a single thread.

- Multi-threaded: Use multiple threads to divide the work and compute the sum concurrently.

Requirements:
Generate an array of integers from 0 to 99,999,999.
Implement both single-threaded and multi-threaded calculations.
Use AtomicLong to store the result in a thread-safe manner for the multi-threaded approach.
Compare and print the execution time for both approaches.