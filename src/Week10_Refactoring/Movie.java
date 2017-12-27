package Week10_Refactoring;

// This class represent a movie
public class Movie {
    public static final int REGULAR_PRICE_CODE = 0;
    public static final int NEW_RELEASE_PRICE_CODE = 1;
    public static final int CHILDREN_PRICE_CODE = 2;

    public static final double CHILDREN_CODE = 1.5;
    public static final double REGULAR_CODE = 1.5;
    public static final double NEW_RELEASE_CODE = 3;

    private String title;
    private int priceCode;
    private double price;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        switch (priceCode) {
            case REGULAR_PRICE_CODE:
                this.price = REGULAR_CODE;
                break;

            case CHILDREN_PRICE_CODE:
                this.price = CHILDREN_CODE;
                break;

            case NEW_RELEASE_PRICE_CODE:
                this.price = NEW_RELEASE_CODE;
                break;

            default:
                this.price = 0;
        }
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle (){
        return title;
    };

    public double getPrice() {
        return price;
    }
}