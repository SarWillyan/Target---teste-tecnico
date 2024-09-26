package QUEST_3;

public class Diaria {
    private int dia;
    private double valor;

    public Diaria(int dia, long valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Diaria{" +
                "dia=" + dia +
                ", valor=" + valor +
                '}';
    }
}
