package algorithm.every.week.stockprice;


import java.util.*;

public class StockPrice{

    private final Map<Integer, Integer> stockPrices;
    private Integer current;
    private final PriorityQueue<Integer> maximums;
    private final PriorityQueue<Integer> minimums;

    public StockPrice() {
        maximums = new PriorityQueue<>(Collections.reverseOrder());
        minimums = new PriorityQueue<>();
        current = Integer.MIN_VALUE;
        stockPrices = new HashMap<>();
    }

    public void update(int timestamp, int price) {
        if (current < timestamp){
            current = timestamp;
        }
        if (stockPrices.containsKey(timestamp) && Objects.equals(maximums.peek(), stockPrices.get(timestamp))){
            maximums.poll();
        }
        if (stockPrices.containsKey(timestamp) && Objects.equals(minimums.peek(), stockPrices.get(timestamp))){
            minimums.poll();
        }
        stockPrices.put(timestamp, price);
        maximums.offer(price);
        minimums.offer(price);
    }

    public int current() {
        return current != null ? stockPrices.get(current) : -1;
    }

    public int maximum() {
        if (!maximums.isEmpty()) {
            return maximums.peek();
        }
        return Integer.MIN_VALUE;
    }

    public int minimum() {
        if (!minimums.isEmpty()) {
            return minimums.peek();
        }
        return Integer.MAX_VALUE;
    }
}
