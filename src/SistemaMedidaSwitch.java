public class SistemaMedidaSwitch {
    public static void main(String[] args) {
        String sigla = "M";
        // Recebe uma sigla de unidade de medida e imprime o nome completo da unidade

        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                // Imprime "PEQUENO" se a sigla for "P"
                break;
            case "M":
                System.out.println("MEDIO");
                // Imprime "MEDIO" se a sigla for "M"
                break;
            case "G":
                System.out.println("GRANDE");
                // Imprime "GRANDE" se a sigla for "G"
                break;
            default:
                System.out.println("INDEFINIDO");
                // Imprime "INDEFINIDO" se a sigla não corresponder a nenhuma das opções
                // anteriores
        }
    }
}
