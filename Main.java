package WypozyczalniaRowerow;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void orderBike (List<Rental>rentalList){
        for (Rental rental : rentalList) {
                System.out.println("Ordered for " +rental.getRentalPeriod()+" days: ("+rental.getValue().name()+", "+rental.getTireThickness()+", "+rental.isBicycleFrame()+") -> "+rental.rentalPrice()+" PLN");
        }
    }
    public static void main(String[] args) {

        Rental bike = new Rental( true, Color.RED,15,25.00 );
        Rental bike1 = new Rental( false, Color.GREEN,40,85.00 );
        Rental bike2 = new Rental( true, Color.BLUE,20,43.00 );

        List<Rental>bikes = new ArrayList<>();
        bikes.add( bike );
        bikes.add( bike1 );
        bikes.add( bike2 );

        orderBike( bikes );

        double totalRentalPrice = bikes.stream().mapToDouble(f -> f.rentalPrice()).sum();
        System.out.println("Rental income: "+totalRentalPrice+" PLN");
    }
}
