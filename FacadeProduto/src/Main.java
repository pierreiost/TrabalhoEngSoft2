import java.util.Scanner;

class main {
    public static void main(String[] args) {
        CadastroProdutoFacade facade = new CadastroProdutoFacade();
        Scanner input = new Scanner(System.in);
        String resposta = "";

        do {
            String nome = "";
            Double preço = 0d;

            System.out.println("Digite o nome do Produto");
            nome = input.nextLine();
            System.out.println("Ok, agora digite o preço");
            preço = input.nextDouble();
            input.nextLine();

            facade.cadastrarProduto(nome, preço);
            System.out.println("\nDigite sim para continuar");
            resposta = input.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));
    }
}
