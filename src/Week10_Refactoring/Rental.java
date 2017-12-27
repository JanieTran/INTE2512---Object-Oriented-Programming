package Week10_Refactoring;

// This class represents a customer renting a movie
class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double calculatePayment() {
        double payment;

        switch (movie.getPriceCode()) {
            case Movie.REGULAR_PRICE_CODE:
                if (daysRented > 2)
                    payment = (daysRented - 2) * movie.getPrice();
                else
                    payment = daysRented * movie.getPrice();
                break;

            case Movie.NEW_RELEASE_PRICE_CODE:
                payment = daysRented * movie.getPrice();
                break;

            case Movie.CHILDREN_PRICE_CODE:
                if (daysRented > 3)
                    payment = (daysRented - 3) * movie.getPrice();
                else
                    payment = daysRented * movie.getPrice();
                break;

            default:
                payment = 0;
        }

        return payment;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}
