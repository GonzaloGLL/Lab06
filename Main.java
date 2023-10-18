import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(1000, 10);
        Auto auto = new Auto(5000, 2000);
        Bicicleta bicicleta = new Bicicleta(100);

        ArrayList<ImpactoEcologico> objetosEcologicos = new ArrayList<>();
        objetosEcologicos.add(edificio);
        objetosEcologicos.add(auto);
        objetosEcologicos.add(bicicleta);

        for (ImpactoEcologico objeto : objetosEcologicos) {
            if (objeto instanceof Edificio) {
                System.out.println("Tipo: Edificio");
            } else if (objeto instanceof Auto) {
                System.out.println("Tipo: Auto");
            } else if (objeto instanceof Bicicleta) {
                System.out.println("Tipo: Bicicleta");
            }
            System.out.println("Impacto Ecologico: " + objeto.obtenerImpactoEcologico());
            System.out.println();
        }
    }
}
