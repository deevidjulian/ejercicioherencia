public class Main {
    public static void main(String[] args) {

        empleado e1 = new empleado("e123456", "pedro", 63, 2000000.0);

        empleadoadministrativosss ea1 = new empleadoadministrativosss(
                "A123456", "maria", 35, 2500000.0, 500000.0
        );

        empleadoventa ev1 = new empleadoventa(
                "A123457", "valentina", 30, 1500000.0, 300000.0, 10
        );

        empleadohoras eh1 = new empleadohoras(
                "A123458", "carlos", 20, 0.0, 80, 20000.0
        );

        System.out.println(e1);
        System.out.println(ea1);
        System.out.println(ev1);
        System.out.println(eh1);

        do {
            System.out.println("""
                    menu
                    1.registro admin
                    2.registro empleado ventas
                    3.registro empleado horas
                    4.mostrar todos los empleados 
                    5. mostrar empleados por tipo 
                    6.salir                    
                    """);

            submew = teclado.nextINT();
            switch (subme){
                case 1 :
                    break;

                case 2 :
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("volviendoi");
                    break;


                case 5:
                break;
            }
        }

    }
}