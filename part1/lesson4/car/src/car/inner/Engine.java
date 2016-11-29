package car.inner;

public class Engine {

    private Cylinder[] cylinder;
    private Integer rpm = 0;

    public Engine(int count) {
        this.cylinder = new Cylinder[count];

        for (int i=0; i < cylinder.length; i++) {
            cylinder[i] = new Cylinder();
        }

    }

    public boolean checkWorking() {
        if (rpm > 0) {
            for(Cylinder c: cylinder)
                c.work();
            return true;
        }
        return false;
    }

    public boolean start() {
        if (!checkWorking()) {
            this.rpm = (int) (Math.random() * 8001);
            return checkWorking();
        }
        return false;
    }

    public void stop() {
        this.rpm = 0;
    }

}


