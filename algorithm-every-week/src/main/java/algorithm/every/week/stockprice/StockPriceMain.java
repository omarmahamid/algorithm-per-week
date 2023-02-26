package algorithm.every.week.stockprice;

public class StockPriceMain{


    public static void main(String[] args) {

        StockPrice stockPrice = new StockPrice();
        stockPrice.update(1, 10); // Timestamps are [1] with corresponding prices [10].
        stockPrice.update(2, 5);  // Timestamps are [1,2] with corresponding prices [10,5].

        System.out.println(stockPrice.current());     // return 5, the latest timestamp is 2 with the price being 5.
        System.out.println(stockPrice.maximum());// return 10, the maximum price is 10 at timestamp 1.
        stockPrice.update(1, 3);  // The previous timestamp 1 had the wrong price, so it is updated to 3.
        // Timestamps are [1,2] with corresponding prices [3,5].
        System.out.println(stockPrice.maximum());     // return 5, the maximum price is 5 after the correction.
        stockPrice.update(4, 2);// Timestamps are [1,2,4] with corresponding prices [3,5,2].


        System.out.println(stockPrice.current());

        stockPrice.update(18,13);
        stockPrice.update(13,25);
        stockPrice.update(13, -11);

        System.out.println(stockPrice.maximum());
        System.out.println(stockPrice.minimum());     // return 2, the minimum price is 2 at timestamp 4.
    }
}
