package beaconear.wamel.com.beaconearsdk.model;

/**
 * Created by Mauro on 21/09/2015.
 */
public enum BeaconState {
    IMMEDIATE(1), NEAR(10), FAR(70);


    private final double value;
    public double getValue() {
        return value;
    }

    private BeaconState(double value) {
        this.value = value;
    }

    public static BeaconState getState(double distance) {
        if(distance <= IMMEDIATE.getValue())
            return IMMEDIATE;
        else if(distance > IMMEDIATE.getValue() && distance <= NEAR.getValue())
            return NEAR;
        else return FAR;
    }


}
