import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void calcularNominaEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getInformacion());
            System.out.println("Salario Neto: $" + empleado.calcularSalarioNeto());
            System.out.println("----------------------");
        }
    }
}
