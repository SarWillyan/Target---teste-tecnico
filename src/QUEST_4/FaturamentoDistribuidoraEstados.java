package QUEST_4;

/**4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 • SP – R$67.836,43
 • RJ – R$36.678,66
 • MG – R$29.229,88
 • ES – R$27.165,48
 • Outros – R$19.849,53
 */

public class FaturamentoDistribuidoraEstados {
    private double sp;
    private double rj;
    private double mg;
    private double es;
    private double outros;
    private double total;

    public FaturamentoDistribuidoraEstados(double sp, double rj, double mg,
                                           double es, double outros) {
        this.sp = sp;
        this.rj = rj;
        this.mg = mg;
        this.es = es;
        this.outros = outros;
    }

    public String percentualGeral(){
        double sum = getTotal();
        double percentSP = (this.sp / sum) * 100;
        double percentRJ = (this.rj / sum) * 100;
        double percentMG = (this.mg / sum) * 100;
        double percentES = (this.es / sum) * 100;
        double percentOutros = (this.outros / sum) * 100;
        return String.format("SP: %.2f%%" +
                        "\nRJ: %.2f%%" +
                        "\nMG: %.2f%%" +
                        "\nES: %.2f%%" +
                        "\nOutros: %.2f%%",
                percentSP, percentRJ, percentMG, percentES, percentOutros);
    }

    public double getTotal() {
        return total = sp + rj + mg + es + outros;
    }

}
