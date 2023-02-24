# Parallel problem.

Suppose you have two threads: a producer thread and a consumer thread. The producer thread generates integers and puts them into a shared buffer, while the consumer thread reads integers from the buffer and processes them.

Design a mechanism to ensure that the producer thread does not put more integers into the buffer than the consumer thread can read and process.

Your solution should be implemented in a way that maximizes concurrency and minimizes the number of blocking calls. In other words, you want to avoid using Thread.sleep() or other blocking operations that can slow down the execution of the program.



