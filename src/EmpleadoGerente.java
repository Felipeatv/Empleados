public class EmpleadoGerente extends Empleado {
    private double bono;

    public EmpleadoGerente(String nombre, String apellido, String numSocial, double salario, double bono) {
        super(nombre, apellido, numSocial, salario);
        this.bono = bono;
    }


    protected double calcularDevengado() {
        return super.calculaDevengado() + bono; // Salario más bono
    }

    @Override
    protected double calcularDeducciones() {
        // Ejemplo de deducciones adicionales por impuesto de riqueza
        double deducciones = super.calcularDeducciones();
        deducciones += calcularDevengado() * 0.02; // 2% de impuesto de riqueza
        return deducciones;
    }
}
