public class Bicicleta implements ImpactoEcologico {
    private int kilometrosRecorridos;

    public Bicicleta(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = kilometrosRecorridos * 0.01;
        double factorEmision = 0.05;
        return datoActividad * factorEmision;
    }
}
