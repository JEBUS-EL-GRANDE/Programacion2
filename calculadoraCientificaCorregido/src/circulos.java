public class circulos extends figuras{
    public circulos(double a) {
        super(a);
    }
    //circulo
    @Override
    public double calcularFiguras(){
        return Math.PI*(a*a);
    }
    //esfera
    public double calcularFiguras3d(){
        return 4*Math.PI*a;
    }
}