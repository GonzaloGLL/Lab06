class Figura {
    public String obtenerDescripcion() {
        return "Esta es una figura genérica.";
    }
}

class FiguraBidimensional extends Figura {
    public double obtenerArea() {
        return 0.0; 
    }
}

// Clase FiguraTridimensional que hereda de Figura
class FiguraTridimensional extends Figura {
    public double obtenerArea() {
        return 0.0; 
    }

    public double obtenerVolumen() {
        return 0.0; 
    }
}

class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String obtenerDescripcion() {
        return "Este es un círculo con radio " + radio;
    }
}

class Cubo extends FiguraTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        return lado * lado * lado;
    }

    @Override
    public String obtenerDescripcion() {
        return "Este es un cubo con lado " + lado;
    }
}


