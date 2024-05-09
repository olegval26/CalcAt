package Model;

public class Resistor {

    private int id;
    private double value;


    public Resistor() {
    }
    public Resistor(int id, double value) {
        this.id = id;
        this.value = value;

    }
    public Resistor(double value) {
        this.value = value;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

}
