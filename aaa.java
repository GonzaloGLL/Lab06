import java.util.ArrayList;

interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

// Clase Edificio
class Edificio implements ImpactoEcologico {
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

class Auto implements ImpactoEcologico {
    private int kilometrosRecorridos;
    private int cilindrada;

    public Auto(int kilometrosRecorridos, int cilindrada) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.cilindrada = cilindrada;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para el DATO_ACTIVIDAD de un Auto
        double datoActividad = (kilometrosRecorridos * 0.02 + cilindrada) * 1.5;
        // Factor de emisión para Auto
        double factorEmision = 0.3;
        // Cálculo del impacto ecológico
        return datoActividad * factorEmision;
    }
}

// Clase Bicicleta
class Bicicleta implements ImpactoEcologico {
    private int kilometrosRecorridos;

    public Bicicleta(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para el DATO_ACTIVIDAD de una Bicicleta
        double datoActividad = kilometrosRecorridos * 0.01;
        // Factor de emisión para Bicicleta
        double factorEmision = 0.05;
        // Cálculo del impacto ecológico
        return datoActividad * factorEmision;
    }
}

