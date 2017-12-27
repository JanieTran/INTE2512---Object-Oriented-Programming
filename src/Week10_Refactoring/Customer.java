package Week10_Refactoring;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    private int frequentRenterPoints;

    public Customer(String name) {
        this.name = name;
        this.frequentRenterPoints = 0;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public double getTotalPayment() {
        double totalPayment = 0;
        Enumeration rents = rentals.elements();

        while (rents.hasMoreElements()) {
            Rental rental = (Rental) rents.nextElement();
            totalPayment += rental.calculatePayment();
        }

        return totalPayment;
    }

    public int getFrequentRenterPoints() {
        Enumeration rents = rentals.elements();

        while (rents.hasMoreElements()) {
            Rental rental = (Rental) rents.nextElement();
            frequentRenterPoints ++;

            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE_PRICE_CODE
                    && rental.getDaysRented() > 1)
                frequentRenterPoints ++;
        }

        return frequentRenterPoints;
    }



    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rents = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rents.hasMoreElements()) {
            double thisAmount = 0;
            Rental eachRental = (Rental) rents.nextElement();

//            // Determine amounts for eachRental line
//            switch (eachRental.getMovie().getPriceCode()) {
//                case Movie.REGULAR_PRICE_CODE:
//                    thisAmount += 2;
//                    if (eachRental.getDaysRented() > 2)
//                        thisAmount += (eachRental.getDaysRented() - 2) * 1.5;
//                    break;
//                case Movie.NEW_RELEASE_PRICE_CODE:
//                    thisAmount += eachRental.getDaysRented() * 3;
//                    break;
//                case Movie.CHILDREN_PRICE_CODE:
//                    thisAmount += 1.5;
//                    if (eachRental.getDaysRented() > 3)
//                        thisAmount += (eachRental.getDaysRented() - 3) * 1.5;
//                    break;
//            }

            // Add frequent renter points
            frequentRenterPoints++;

            // Add bonus for a two day new release rental
            if ((eachRental.getMovie().getPriceCode() == Movie.NEW_RELEASE_PRICE_CODE) && eachRental.getDaysRented() > 1)
                frequentRenterPoints++;

            // Show figures for this rental
            result += "\t" + eachRental.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // Add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
