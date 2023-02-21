package algorithm.every.week.trafficlight;

import java.util.List;

/**
 * the algorithm works for 4 streets per intersection
 * */
public class Intersection{

    private List<Street> streets;
    private String intersectionName;

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    public String getIntersectionName() {
        return intersectionName;
    }

    public void setIntersectionName(String intersectionName) {
        this.intersectionName = intersectionName;
    }
}
