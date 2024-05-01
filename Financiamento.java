public class Financiamento {

    public Double ValorTotal;
    public Double entrada;
    public int parcelas;

    //construtor para instanciar o obj
    public Financiamento (double ValorTotal, double entrada, int parcelas) {

        if (entrada < ValorTotal * 0.2) {
            throw new RuntimeException ("A entrada deve ser pelo menos 20% do valor total.");
        } else if (parcelas < 6 || parcelas > 10) {
            throw new RuntimeException ("O numero de parcelas deve ser entre 6 e 10.");
        } 
        // Não usei "println" porque não posso ter print em classe de dominio

        this.ValorTotal = ValorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double prestacao() {
        return (ValorTotal - entrada) / parcelas;
    }
}