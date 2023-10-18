public class Edificio implements ImpactoEcologico {
    private int consumoCombustible;
    private int numeroHabitantes;

    public Edificio(int consumoCombustible, int numeroHabitantes) {
        this.consumoCombustible = consumoCombustible;
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double datoActividad = (consumoCombustible * 2.0 - numeroHabitantes) * 0.1;
        double factorEmision = 0.5;
        return datoActividad * factorEmision;
    }
}
