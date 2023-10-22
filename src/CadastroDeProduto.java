
import java.util.Scanner;
import java.util.*;

public class CadastroDeProduto {

    public static void main(String[] args) throws Exception {

        Produto[] produto = new Produto[100]    ;
        ProdutoPerecivel[] produtoperesivel = new ProdutoPerecivel[100]; 

        int repete = 1;

        while(repete == 1){

            // Consumir o caractere de nova linha
           try (Scanner input = new Scanner(System.in))
           {
                System.out.println("Escolha um opcao do meno abaixo:");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Cadastra produto perecivel");
                System.out.println("3 - Sair do Programa");

                // código que usa o objeto Scanner
                int reposta = input.nextInt();

                // Consumir o caractere de nova linha
                input.nextLine();
            
            
                switch (reposta) {
                    case 1:
                        //coletando informações para cadastrar um produto
                        System.out.println("---Cadastrar produto---\n");
                        System.out.println("Digite a descricao do produto:");
                        String descricao = input.nextLine(); // usar nextLine() em vez de next()
                        System.out.println("Digite o valor do produto:");
                        double valor = input.nextDouble();
                        int aux1 = Produto.getQuantidade();
                        produto[aux1] = new Produto(descricao, valor);

                        //impriminedo informações do produto
                        System.out.println(produto[aux1].toString());

                        // Consumir o caractere de nova linha
                        input.nextLine();

                    break;
                    case 2:
                        //coletando informações para cadastra um produto perecivel
                        System.out.println("---Cadastrar produto perecivel---\n");
                        System.out.println("Digite a descrição do produto:");
                        descricao = input.next();
                        System.out.println("Digite o valor do produto:");
                        valor = input.nextDouble();
                        System.out.println("digite o dia de validade do produto:");
                        int dia = input.nextInt();
                        System.out.println("digite o mes de validade do produto:");
                        int mes = input.nextInt();
                        System.out.println("digite o ano de validade do produto:");
                        int ano = input.nextInt();
                        int aux2 = Produto.getQuantidade();
                        produto[aux2] = new ProdutoPerecivel(descricao, valor, dia, mes, ano);

                        //impriminedo informações do produto
                       System.out.println(produto[aux2].toString());

                        // Consumir o caractere de nova linha
                        input.nextLine();

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
}


