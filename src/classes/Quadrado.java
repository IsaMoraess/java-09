package classes;

public class Quadrado implements FiguraGeometrica {
    // Atributo
    private int lado;

    // Construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }
    // Metodo especifico
    public double gerarArea(){
    return Math.pow(lado, 2);

    }

    // Getters e setters
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
