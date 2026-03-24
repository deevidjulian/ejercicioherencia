public class empleadoadministrativosss extends empleado{

    private double bonificacionFija;

    public empleadoadministrativosss() {
    }

    public empleadoadministrativosss(String identificacion, String nombre, int edad, Double salario, double bonificacionFija) {
        super(identificacion, nombre, edad, salario);
        this.bonificacionFija = bonificacionFija;
    }

    public double getBonificacionFija() {
        return bonificacionFija;
    }

    public void setBonificacionFija(double bonificacionFija) {
        this.bonificacionFija = bonificacionFija;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", bonificacionFija=" + bonificacionFija;
    }


    public void mostrarInf(){
        System.out.println("identificanio" +identificacion);
        System.out.println("nombre" + nombre);
        System.out.println("salario" +salario);
        System.out.println("edad" +edad);
        System.out.println("bonificacion" +bonificacionFija);

    }

public void  registraradmin(){
       System.out.println("nombre");
       String nombre;

}



}
