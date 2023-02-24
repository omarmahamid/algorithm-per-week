package algorithm.every.week.buildingh2o;

public class BuildingH2OMain{

    public static void main(String[] args) throws InterruptedException {

        BuildingH2O buildingH2O = new BuildingH2O();
        StringBuilder sb = new StringBuilder();

        Thread hydrogenThread1 = new Thread(() -> {
            try {
                buildingH2O.hydrogen(() -> sb.append("H"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread hydrogenThread2 = new Thread(() -> {
            try {
                buildingH2O.hydrogen(() -> sb.append("H"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread oxygenThread = new Thread(() -> {
            try {
                buildingH2O.oxygen(() -> sb.append("O"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        hydrogenThread1.start();
        oxygenThread.start();
        hydrogenThread2.start();

        // Wait for the threads to finish
        hydrogenThread1.join();
        oxygenThread.join();
        hydrogenThread2.join();


        System.out.println(sb.toString().equals("HHO"));

    }
}
