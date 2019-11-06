public class Produto {
    String nomeproduto,dtcompra;
    double valor;
    int quantidade;

    void dadosproduto() {
        System.out.println("\n");
        System.out.println("====== Dados do produto =====");
        System.out.println("\n");
        System.out.println("Produto é:" + this.nomeproduto);
        System.out.println("Quantidades d filmes em esotque:" + this.estoque);
        System.out.println(" Valor:" + this.valor + " reais");
        
    }
}
