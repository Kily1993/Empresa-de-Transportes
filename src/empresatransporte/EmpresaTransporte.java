package empresatransporte;

import java.util.ArrayList;

public class EmpresaTransporte {

    static ArrayList<Envio> envios = new ArrayList<Envio>();
    static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static void rellenarDatos() {

        EnvioAzul ea;
        Envio24 e24;
        Empleado e;
        Coche c;
        Furgo f;
        Camion cam;

        for (int i = 0; i < 10; i++) {
            ea = new EnvioAzul();
            ea.setPeso((int) (Math.random() * 50));
            ea.setFecha("12/" + i + "/2017");
            ea.setValor((int) (Math.random() * 100));
            envios.add(ea);

            e24 = new Envio24();
            e24.setPeso((int) (Math.random() * 50));
            e24.setFecha("12/" + i + "/2017");
            e24.setPrioridad((int) (Math.random() * 200));
            envios.add(e24);

            e = new Empleado();
            e.setNombre("Manolo " + i);
            e.setEdad((int) (Math.random() * (56 - 18) + 18));
            empleados.add(e);

            c = new Coche();
            c.setMarca("Peugeot " + i);
            c.setColor("Azul " + i);
            c.setMatricula(123 + i);
            vehiculos.add(c);

            f = new Furgo();
            f.setMarca("Pegaso " + i);
            f.setMatricula(234 + i);
            f.setPma((double) (Math.random() * 999));
            vehiculos.add(f);

            cam = new Camion();
            cam.setMarca("Volvo " + i);
            cam.setMatricula(345 + i);
            cam.setVolumen((double) (Math.random() * 1000));
            vehiculos.add(cam);

        }
    }

    public static void mostrarTodosEnvios() {
        for (Envio envio : envios) {
            envio.mostrar();

        }

    }

    public static void mostrarEnvio24hMayorPeso() {
        int mayorpeso = 0;
        for (Envio e : envios) {
            if (e instanceof Envio24) {
                if (mayorpeso < e.getPeso()) {
                    mayorpeso = e.getPeso();

                }
            }

        }
        System.out.println("El mayor peso del envio 24h es: " + mayorpeso + "kg");
    }

    public static void mostrarSumaPesosPorCadaEnvio() {
        int pesoAzul = 0;
        int peso24 = 0;
        for (Envio e : envios) {
            if (e instanceof EnvioAzul) {
                pesoAzul = pesoAzul + e.getPeso();

            } else {
                peso24 = peso24 + e.getPeso();
            }
        }
        System.out.println("El peso de todos los paquetes azules " + pesoAzul + "kg");
        System.out.println("El peso de todos los paquetes 24 horas " + peso24 + "kg");
        System.out.println("El peso total de todos los paquetes es " + (pesoAzul + peso24) + "kg");

    }

    public static void asignarEmpleadoVehiculo(Vehiculo v,Empleado e) {
        v.setConductor(e);

        System.out.println("El vehiculo "+v.getMarca()+" esta asignado al empleado "+e.getNombre() );
    }

    public static void main(String[] args) {
        rellenarDatos();
        //mostrarTodosEnvios();
        //mostrarEnvio24hMayorPeso();
        //mostrarSumaPesosPorCadaEnvio();
        
        Vehiculo miVehiculo = vehiculos.get(6);
        Empleado miEmpleado = empleados.get(2);
        
        asignarEmpleadoVehiculo(miVehiculo, miEmpleado);

    }

}
