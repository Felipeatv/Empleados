public class EmpleadoPorSueldo extends Empleado {
    private double sueldoMensual;
    private double retencionEnLaFuente;
    private double fondoDeSolidaridad;
    private double salud;
    private double pension;

    // Constructor
    public EmpleadoPorSueldo(String nombre, String apellido, String numSocial, double sueldoMensual,
                             double retencionEnLaFuente, double fondoDeSolidaridad, double salud, double pension) {
        super(nombre, apellido, numSocial, sueldoMensual);
        this.sueldoMensual = sueldoMensual;
        this.retencionEnLaFuente = retencionEnLaFuente;
        this.fondoDeSolidaridad = fondoDeSolidaridad;
        this.salud = salud;
        this.pension = pension;
    }

    @Override
    protected double calculaDevengado() {
        // El devengado es el salario mensual + deducciones de salud y pensión
        return sueldoMensual + salud + pension;
    }

    @Override
    protected double calcularDeducciones() {
        // Deducciones calculadas en base a porcentajes
        double deduccionesRetencion = sueldoMensual * (retencionEnLaFuente / 100);
        double deduccionesFondoSolidaridad = sueldoMensual * (fondoDeSolidaridad / 100);

        // Suma de todas las deducciones (retención en la fuente y fondo de solidaridad)
        return deduccionesRetencion + deduccionesFondoSolidaridad;
    }

    @Override
    protected double calcularSalarioNeto() {
        // El salario neto es el devengado menos las deducciones
        return calculaDevengado() - calcularDeducciones();
    }
}
