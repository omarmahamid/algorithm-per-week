package algorithm.every.week.buildingh2o;



public class BuildingH2O{

    private int counter;

    public BuildingH2O(){
        this.counter = 1;
    }

    public synchronized void hydrogen(Runnable releaseHydrogen) throws InterruptedException{

        while (counter % 3 == 0){
            wait();
        }

        releaseHydrogen.run();

        counter++;

        notifyAll();
    }


    public synchronized void oxygen(Runnable releaseOxygen) throws InterruptedException {

        while (counter % 3 != 0){
            wait();
        }

        releaseOxygen.run();

        counter++;

        notifyAll();
    }
}
