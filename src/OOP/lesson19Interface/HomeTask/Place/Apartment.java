package OOP.lesson19Interface.HomeTask.Place;

import OOP.lesson19Interface.HomeTask.Family;

import java.util.Arrays;

public class Apartment extends LivingPlace{

    private Family [] families;
    public Apartment(String placeType, String address, Family [] families) {
        super(placeType, address);
        this.families = families;
    }

    public Family[] getFamilies() {
        return families;
    }

    public void setFamilies(Family[] families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "The family lives in " + getPlaceType() + " in the " + getAddress()  + Arrays.toString(families);
    }


}
