import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.*;

import javax.xml.crypto.Data;

public class CadastroDeProduto {

    public static void main(String[] args) throws Exception {

        Produto[] produto = new Produto[100]    ;
        ProdutoPerecivel[] produtoperesivel = new ProdutoPerecivel[100]; 

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
                    int aux1 = Produto.getQuantidade();
                    produto[aux1] = new Produto(descricao, valor);
                    break;
                case 2:
                    System.out.println("---Cadastrar produto perecivel---\n");
                    System.out.println("Digite a descrição do produto:");
                    descricao = input.next();
                    System.out.println("Digite o valor do produto:");
                    valor = input.nextDouble();
                    Object request;

                    // Obter a data inserida pelo usuário
                    System.out.println("Digite uma data no formato dd/MM/yyyy:");
                    String dataInserida = input.nextLine();

                    // Converter a data inserida para um objeto Date
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataUsuario = sdf.parse(dataInserida);

                    // Obter a data atual do sistema
                    Date dataAtual = new Date();
                    


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


