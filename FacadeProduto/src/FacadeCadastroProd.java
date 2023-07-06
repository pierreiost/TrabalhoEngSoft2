class CadastroProdutoFacade {
    public void cadastrarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        salvarProduto();
        System.out.println("Produto cadastrado: " + produto.getNome());
        System.out.println("Valor do Produto cadastrado: " + produto.getPreco());
    }

    private void salvarProduto() {
        System.out.println("Produto salvo no banco de dados");
    }
}