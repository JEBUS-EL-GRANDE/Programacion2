public class cuadrado extends figuras{
    public cuadrado(double a) {
        super(a);
    }
    //cuadrado
    @Override
    public double calcularFiguras(){
        return a*a;
    }
    //cubo
    public double calcularFiguras3d(){
        return a*a*6;
    }
}