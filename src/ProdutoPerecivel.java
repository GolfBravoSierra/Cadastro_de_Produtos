/// Projeto: Cadastro de produtos
///
/// Alunos: Lucca Vasconcelo Costa Oliveira     RA: 22003004
///         Giovani Bellini dos Santos          Ra: 22007263
///         Victor de Melo Roston               RA: 22006737
///

import java.time.LocalDate;
import java.util.*;

class ProdutoPerecivel extends Produto {
    int diaatual, mesatual, anoatual;
    int diausu, mesusu, anousu;


    //construtor
    public ProdutoPerecivel(String descricao , double valor , int diausu, int mesusu, int anousu) {
        super(descricao , valor);
        this.diausu = diausu;
        this.mesusu = mesusu;
        this.anousu = anousu;
        getDateTime();       
    }

    //metodo para pegar a data atual
    private void getDateTime() {     
        Calendar cal = Calendar.getInstance();
        this.anoatual = cal.get(Calendar.YEAR);
        this.mesatual = cal.get(Calendar.MONTH) + 1;
        this.diaatual = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Data atual: " + this.diaatual + "/" + this.mesatual + "/" + this.anoatual);
    }

    
    //metodo para verificar se o produto esta vencido
    public boolean estaVencido(){

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataValidade = LocalDate.of(this.anousu, this.mesusu, this.diausu);

        if (dataValidade.isBefore(dataAtual)) {
            return true;
        }

        return false;
    }

    //metodo para aplicar desconto
    public double aplicarDesconto() {
        if (estaVencido() == true) {
            setValor(getValor() * 0.88);
            return getValor(); 
        } else {
            return getValor();
        }
    }

    //metodo para retornar informacoes do produto
    public String toString() {
        return "ID: " + getId() + " Descricao: " + getDescricao() + " Valor: " + aplicarDesconto() + " Data de validade: " + this.diausu + "/" + this.mesusu + "/" + this.anousu;
    }
    
}
