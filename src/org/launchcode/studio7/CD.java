package org.launchcode.studio7;

import org.launchcode.studio7.interfaces.OpticalDisc;

public class CD extends BaseDisc implements OpticalDisc {
    private static final Integer minSpeed= 200;
    private static final Integer maxSpeed= 500;

    public CD(String name, double capacity, boolean isBranded) {
        super(name, capacity, isBranded);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of "+ minSpeed + " - "+maxSpeed+" rpm.");
    }

    @Override
    public void storeData(Data content) {

    }

    @Override
    public void wipeDisc() {

    }
}
