public class ProgramaPrincipal {

    public static void main(String[] args) {
        double ValorTotal = 1000.0;
        double entrada = 300.0;
        int parcelas = 120;

        try {
            Financiamento f = new Financiamento(ValorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
            /**
             * eu peguei a minha exceção "RuntimeException" dei o nome de "e"
             * Vou imprimir na tela a mensagem chamando o "e.getMessage()"
             */
        }
    }
}
