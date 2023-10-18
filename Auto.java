public class Auto implements ImpactoEcologico {
    private int kilometrosRecorridos;
    private int cilindrada;

    public Auto(int kilometrosRecorridos, int cilindrada) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cilindrada = cilindrada;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = (kilometrosRecorridos * 0.02 + cilindrada) * 1.5;
        double factorEmision = 0.3;
        return datoActividad * factorEmision;
    }
}
