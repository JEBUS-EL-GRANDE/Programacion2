public abstract class figuras {
    protected double a;
    public figuras(double a) {
        this.a = a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    
    public abstract double calcularFiguras();
}