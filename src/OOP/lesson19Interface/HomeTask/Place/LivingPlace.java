package OOP.lesson19Interface.HomeTask.Place;

public abstract class LivingPlace {
    private String placeType;
    private String address;

    public LivingPlace(String placeType, String address) {
        this.placeType = placeType;
        this.address = address;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LivingPlace: " +
                "placeType - " + placeType +
                ", address - " + address;
    }
}
