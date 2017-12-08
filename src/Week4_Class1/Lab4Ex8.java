package Week4_Class1;

import Week4_Class1.Measures.Length;

public class Lab4Ex8 {
    public static void main(String[] args) {
        Length carpetWidth = new Length(4,0,0);
        Length carpetLength = new Length(2,9,0);

        float carpetArea = carpetWidth.area(carpetLength);
        System.out.println("Total 200 carpets weight: " + 1.25 * carpetArea * 200);

        carpetWidth = new Length(3,57,0);
        carpetLength = new Length(5,0,0);

        carpetArea = carpetWidth.area(carpetLength);
        System.out.println("Total 60 carpets weight: " + 1.05 * carpetArea * 60);
    }
}
