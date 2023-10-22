import java.util.*;
import java.text.*;
public class Produto {
    private String descricao;   //Descricao do produto
    private int id;             //ID do produto
    private double valor;       //Valor do produto
    private static int quantidade = 0 ;     //Quantidade de produtos
    
    public Produto(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
        quantidade++;
        this.id = quantidade;
    }

    //Metodo retorna descricao
    public String getDescricao(){
        return this.descricao;
    }

    //Metodo retorna ID
    public int getId(){
        return this.id;
    }

    //Metodo retorna valor
    public double getValor(){
        return this.valor;
    }

    //Metodo retorna quantidade
    public static int getQuantidade(){
        return Produto.quantidade;
    }



    //Metodo retorna informacoes do produto
    public String toString(){
        return "ID: " + this.id + " Descricao: " + this.descricao + " Valor: " + this.valor;
    }
} 
