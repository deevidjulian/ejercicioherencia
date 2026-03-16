public class empleadohoras extends empleado{
    private double horasTrabajadas;
    private double valorHora;

    public empleadohoras() {
    }

    public empleadohoras(String identificacion, String nombre, int edad, Double salario, double horasTrabajadas, double valorHora) {
        super(identificacion, nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "empleadoHoras{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                '}';
    }
    public void mostrarInf(){
        System.out.println("identificanio" +identificacion);
        System.out.println("nombre" + nombre);
        System.out.println("horas trabajas" +horasTrabajadas);
        System.out.println("valor de horas" +valorHora);
    }
}