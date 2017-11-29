package ejercicios_clases;

public abstract class ejerciocio_figuras {

    public abstract double area();

    public abstract double perímetro();

}

class Triangulo extends ejerciocio_figuras {

    private double altura;
    private double base;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double altura, double base, double lado1, double lado2, double lado3) {
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double area() {
        double areat = (base * altura) / 2;
        return areat;
    }

    public double perímetro() {

        double perímetro = lado1 + lado2 + base;
        return perímetro;
    }

}
    class Circulo extends ejerciocio_figuras {

     

        private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

        public double area() {
            double area = Math.PI * Math.pow(radio, 2);
            return area;
        }
        public double perímetro() {

        double perímetro = (Math.PI*2)*radio;
        return perímetro;
        
    }
    }
class adsada {
    public static void main(String[] args) {
        double base = 10.5;
        double altura = 7.5;
        double lado1 = 7;
        double lado2 = 8.4;
        Triangulo aux = new Triangulo(base, altura);
        Triangulo p = new Triangulo(base, base, base);
        double a = aux.area();
        double b = p.perímetro();
        System.out.println("El area es: "+a);
        System.out.println("El perímetro es: "+b);
        
    }
}
