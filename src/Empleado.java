public class Empleado {
    private String nombre;
    private String apellido;
    private String numSocial;
    private double salario;


    public Empleado(String nombre, String apellido, String numSocial, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSocial = numSocial;
        this.salario = salario;
    }

    protected double calculaDevengado(){
        return salario;
    }

    protected double calcularDeducciones(){
        return 0;
    }

    protected double calcularSalarioNeto(){
        return calculaDevengado()-calcularDeducciones();
    }

    protected String getInformacion(){
        return "Nombre: " + nombre + " " + apellido + "\n" +
                "Número de Seguro Social: " + numSocial + "\n" +
                "Salario Base: $" + salario;



    }
}
