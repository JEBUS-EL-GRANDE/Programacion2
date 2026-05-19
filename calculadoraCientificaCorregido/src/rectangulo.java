public class rectangulo extends figuras{
    protected double b;
    public rectangulo(double a, double b) {
        super(a);
        this.b=b;
    }
    
    //rectangulo
    @Override
    public double calcularFiguras(){
        return a*b;
    }
    //triangulo rectangulo 
    public double trianguloRectangulo(){
        return (a*b)/2;
    }
}