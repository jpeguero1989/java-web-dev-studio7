package org.launchcode.studio7;

import org.launchcode.studio7.interfaces.OpticalDisc;

public class DVD extends BaseDisc implements OpticalDisc {
    private static final Integer minSpeed= 570;
    private static final Integer maxSpeed= 1600;

    public DVD(String name, double capacity, boolean isBranded) {
        super(name, capacity, isBranded);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of "+ minSpeed + " - "+maxSpeed+" rpm.");
    }

    @Override
    public void storeData(Data content) {

    }

    @Override
    public void wipeDisc() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
