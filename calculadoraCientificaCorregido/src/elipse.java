public class elipse extends figuras{
    protected double b;
    public elipse(double a,double b) {
        super(a);
        this.b=b;
    }
    //elipse
    @Override
    public double calcularFiguras(){
        return Math.PI*a*b;
    }
}