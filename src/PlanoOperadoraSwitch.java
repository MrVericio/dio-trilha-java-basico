public class PlanoOperadoraSwitch {
    public static void main(String[] args) {
        String plano = "T"; // M, B ou T
        // Recebe um plano de operadora e imprime o valor correspondente ao plano

        switch (plano) {
            case "T": {
                System.out.println("5GB Youtube");
                // Imprime "5GB Youtube" se o plano for "T"
            }
            case "M": {
                System.out.println("Whats e Instagram ilimitados");
                // Imprime "Whats e Instagram ilimitados" se o plano for "M"
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                // Imprime "100 minutos de ligação" se o plano for "B"
            }
        } // Imprime "100 minutos de ligação", "Whats e Instagram ilimitados" e "5GB
          // Youtube" se o plano for "T"
    }
}
