package algorithm.every.week.trafficlight;

import java.util.PriorityQueue;

public class RegularSchedulingAlgorithm implements SchedulingAlgorithm{

    @Override
    public void schedule(Intersection intersection) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        intersection.getStreets().forEach(x -> queue.add(x.getNumOfCars()));



    }
}
