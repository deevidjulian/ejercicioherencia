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

<<<<<<< HEAD
    @Override
    public String toString() {
        return super.toString() +
                ", bonificacionFija=" + bonificacionFija;
    }

=======
>>>>>>> d31045355ebe2a7a633a6964da119de5d2fe8c09
    public void mostrarInf(){
        System.out.println("identificanio" +identificacion);
        System.out.println("nombre" + nombre);
        System.out.println("salario" +salario);
        System.out.println("edad" +edad);
        System.out.println("bonificacion" +bonificacionFija);

    }
<<<<<<< HEAD
public void  registraradmin(){
       System.out.println("nombre");
       String nombre==

}
=======

>>>>>>> d31045355ebe2a7a633a6964da119de5d2fe8c09


}
