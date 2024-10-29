public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String apellido, String numSocial, double salario, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, numSocial, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    protected double calcularDevengado() {
        return horasTrabajadas * tarifaPorHora; // Calcula el salario basado en horas trabajadas
    }

    @Override
    protected double calcularDeducciones() {
        // Ejemplo: deducciones del 5% para fondo de solidaridad
        return (calcularDevengado() * 0.05);
    }
}
