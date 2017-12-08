package Week4_Class1.Measures;

public class Weight {
    public int tons, kg, gr;

    // CONSTRUCTORS
    public Weight() {
        tons = kg = gr = 0;
    }

    public Weight(int tons, int kg, int gr) {
        this.tons = tons;
        this.kg = kg;
        this.gr = gr;
    }

    public Weight(int tons) {
        this.tons = tons;
        this.kg = tons * 1000;
        this.gr = tons * 1000000;
    }

    // METHODS
    public Weight add(Weight obj) {
        return new Weight(tons + obj.tons);
    }

    public Weight subtract(Weight obj) {
        return new Weight(tons - obj.tons);
    }

    public Weight multiplyNum(int num) {
        return new Weight(tons * num);
    }

    public Weight multiply(Weight obj) {
        return new Weight(tons * obj.tons);
    }
}
