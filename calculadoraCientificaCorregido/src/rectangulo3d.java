public class rectangulo3d extends rectangulo{
    protected double c;
    public rectangulo3d (double a, double b, double c) {
        super(a,b);
        this.c=c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }
    //rectangulo 3d
    @Override
    public double calcularFiguras(){
        return 2*((a*b)+(a*c)+(c*b));
    }
}