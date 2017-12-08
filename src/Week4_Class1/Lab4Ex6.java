package Week4_Class1;

public class Lab4Ex6 {
    public static void main(String[] args) {
        LinearEquation eqt = new LinearEquation(2,3,4,5,6,7);
        System.out.println(eqt.isSolvable() ? "The equation has solution" : "The equation has no solution");
    }
}

class LinearEquation {
    private float a,b,c,d,e,f;

    public LinearEquation(float a, float b, float c, float d, float e, float f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public float getX() {
        // x = (ed - bf)/(ad - bc)
        return (e*d - b*f)/(a*d - b*c);
    }

    public float getY() {
        // y = (af - ec)/(ad - bc)
        return (a*f - e*c)/(a*d - b*c);
    }
}
