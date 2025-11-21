package DispositivosElectronicos;

public class Laptop extends Dispositivo {
    private int ram; // por ejemplo

    public Laptop(String marca, String modelo, double precio, int ram) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.ram = ram;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Laptop ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("RAM: " + ram + "GB");
        System.out.println();
    }
}

