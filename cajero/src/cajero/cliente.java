public class Cliente {
    private String puesto;
    private Double sueldo;
    private String departamento;

    
    public Cliente(String puesto, Double sueldo, String departamento) {
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    public void agregarDinero(Double cantidad) {
        this.sueldo += cantidad;
    }

    
    public void imprimirDetalles() {
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Departamento: " + departamento);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Cliente cliente1 = new Cliente("Gerente", 5000.0, "Ventas");
        cliente1.imprimirDetalles();

        
        cliente1.agregarDinero(1000.0);
        System.out.println("Después de agregar dinero:");
        cliente1.imprimirDetalles();
    }
}
