# Parallel problem

Suppose you have a system that processes a stream of events. Each event has a timestamp and a payload. You need to process the events in real-time and maintain a sliding window of the average payload size for the last N seconds.

Design a mechanism to efficiently compute the sliding window average in real-time, with minimal latency and no unnecessary blocking calls.

Your solution should be implemented in a way that maximizes concurrency and minimizes the number of blocking calls. In other words, you want to ensure that the sliding window average can be computed efficiently and accurately, even when there are multiple events being processed concurrently.



