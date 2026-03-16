public class empleadoventa extends empleado{
    private double totalVentas;
    private int Comision;

    public empleadoventa() {
    }

    public empleadoventa(String identificacion, String nombre, int edad, Double salario, double totalVentas, int comision) {
        super(identificacion, nombre, edad, salario);
        this.totalVentas = totalVentas;
        Comision = comision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getComision() {
        return Comision;
    }

    public void setComision(int comision) {
        Comision = comision;
    }

    @Override
    public String toString() {
        return "empleadoVEntas{" +
                "totalVentas=" + totalVentas +
                ", Comision=" + Comision +
                '}';
    }

    public void mostrarInf(){
        System.out.println("identificanio" +identificacion);
        System.out.println("nombre" + nombre);
        System.out.println("salario" +salario);
        System.out.println("total ventas" +totalVentas);
        System.out.println("comision" +Comision);

    }
}