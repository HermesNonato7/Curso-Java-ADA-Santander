package ;

public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        //boolean vamosAPraia = fimDeSemana && fazendoSol;
        if (fimDeSemana && fazendoSol) {
            System.out.println("Vamos a praia!");
        }else {
            System.out.println("Não vamos a praia!");
        }

        // Tabela verdade
        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // fase || true = true
        // false || false = false

        String mensagem1 = fimDeSemana ? "É fim de semana!" : "Não é fim de semana";
        System.out.println(mensagem1);
        String mensagem2 = fazendoSol ? "Esta ensolarado!!" : "Está chovendo!";
        System.out.println(mensagem2);
    }
}