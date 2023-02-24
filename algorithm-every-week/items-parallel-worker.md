# Parallel problem

Suppose you have a system that processes requests from clients. Each request consists of a list of items that need to be processed. There are several worker threads that can process the items concurrently, but each item must be processed in order, and no two items can be processed at the same time.

Design a mechanism to ensure that the items are processed in order, without any unnecessary blocking calls.

Your solution should be implemented in a way that maximizes concurrency and minimizes the number of blocking calls. In other words, you want to ensure that all available worker threads are being used to process the items as quickly as possible, while still maintaining the order of processing.



