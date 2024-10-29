public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Crear empleados
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", "Pérez", "12345", 0, 160, 50.0f);
        EmpleadoPorSueldo empleado2 = new EmpleadoPorSueldo("Ana", "García", "67890", 3000.0, 10.0, 1.0, 300.0f, 200.0f);
        EmpleadoGerente empleado3 = new EmpleadoGerente("Carlos", "Martínez", "54321", 5000.0, 1000.0);

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);

        // Calcular y mostrar nómina
        empresa.calcularNominaEmpleados();
    }
}
