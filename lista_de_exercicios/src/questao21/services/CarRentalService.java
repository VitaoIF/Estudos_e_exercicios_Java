package questao21.services;

import questao21.entities.CarRental;
import questao21.entities.Invoice;

import java.time.Duration;

public class CarRentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public CarRentalService(TaxService taxService, Double pricePerDay, Double pricePerHour) {
        this.taxService = taxService;
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60.0;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }

        double taxa = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, taxa));
    }
}
