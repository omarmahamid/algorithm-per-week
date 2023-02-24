# concurrency problem

Here's a concurrency problem for coding interview in LeetCode style:

Suppose you have a class called Foo with three methods: first(), second(), and third(). The same instance of Foo will be passed to three different threads. Each thread is responsible for calling one of the methods in the following order:

Thread A calls first()
Thread B calls second()
Thread C calls third()
Design a mechanism to ensure that second() is called after first(), and third() is called after second().

Your solution should be implemented in a way that maximizes concurrency and minimizes the number of blocking calls. In other words, you want to avoid using Thread.sleep() or other blocking operations that can slow down the execution of the program.



