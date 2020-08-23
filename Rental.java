package WypozyczalniaRowerow;

public class Rental {

    private boolean bicycleFrame;
    private Color value;
    private Integer rentalPeriod;
    private Double tireThickness;

    public Integer isBicycleFrame() {
        if ((bicycleFrame)) {
            return 2;
        }
        return 1;
    }

    public Color getValue() {
        return value;
    }
    public Integer getRentalPeriod() {
        return rentalPeriod;
    }
    public Double getTireThickness() {
        return tireThickness;
    }

    public Rental(boolean bicycleFrame, Color value, Integer rentalPeriod, Double tireThickness) {
        this.bicycleFrame = bicycleFrame;
        this.value = value;
        this.rentalPeriod = rentalPeriod;
        this.tireThickness = tireThickness;
    }
    public Double rentalPrice(){

        Double rentalPrice = rentalPeriod*((isBicycleFrame()*(getValue().value+(tireThickness/3)))/20);
        Double bikeRentalPrice = Math.round(rentalPrice * 100.0) / 100.0;

        return bikeRentalPrice;
    }
}
