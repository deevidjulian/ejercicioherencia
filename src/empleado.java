public class empleado {

    protected String identificacion;
    protected String nombre;
    protected int edad;
    protected Double salario;


    public empleado() {
    }

    public empleado(String identificacion, String nombre, int edad, Double salario) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "empleado{" +
                "identificacion='" + identificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }


    public void mostrarinformacion() {

        {
            System.out.println("identificanio" + identificacion);
            System.out.println("nombre" + nombre);
            System.out.println("salario" + salario);
            System.out.println("edad" + edad);

        }

    }
    }