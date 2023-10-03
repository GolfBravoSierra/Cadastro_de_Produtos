import java.util.Scanner;

public class CadastroDeProduto {

    public static void main(String[] args) throws Exception {

        Produto[] produto = new Produto[100]    ; 

        System.out.println("Escolha um opção do meno abaixo:");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Cadastra produto perecivel");
        System.out.println("3 - Sair do Programa");

        try (Scanner input = new Scanner(System.in)) {
            // código que usa o objeto Scanner
            int reposta = input.nextInt();
    
            switch (reposta) {
                case 1:
                    System.out.println("---Cadastrar produto---\n");
                    System.out.println("Digite a descrição do produto:");
                    String descricao = input.next();
                    System.out.println("Digite o valor do produto:");
                    double valor = input.nextDouble();
                    int aux = Produto.getQuantidade();
                    produto[aux] = new Produto(descricao, valor);
                    break;
                case 2:
                    System.out.println("Cadastra produto perecivel");
                    break;
                case 3:
                    System.out.println("Sair do Programa");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

    }
}


