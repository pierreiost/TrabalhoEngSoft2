import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
            this.preco = preco;
    }
}

class CadastroProduto {
    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);

        System.out.println("Produto cadastrado: " + produto.getNome());
        System.out.println("Valor do Produto cadastrado: " + produto.getPreco());
    }
}

public class Main {
    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
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

            cadastroProduto.cadastrarProduto(nome, preço);
            System.out.println("\nDigite sim para continuar");
            resposta = input.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));
    }
}