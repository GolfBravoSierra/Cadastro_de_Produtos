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
        this.mesatual = cal.get(Calendar.MONTH);
        this.diaatual = cal.get(Calendar.DAY_OF_MONTH);
    }

    
    //metodo para verificar se o produto esta vencido
    public boolean estaVencido(){
        if (this.anousu < this.anoatual){
            return true;
        }else if (this.anousu == this.anoatual){
            if (this.mesusu < this.mesatual){
                return true;
            }else if (this.mesusu == this.mesatual){
                if (this.diausu < this.diaatual){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    //metodo para aplicar desconto
    public double aplicarDesconto() {
        if (estaVencido()) {
            return getValor() * 0.5;
        } else {
            return getValor();
        }
    }

    //metodo para retornar informacoes do produto
    public String toString() {
        return "ID: " + getId() + " Descricao: " + getDescricao() + " Valor: " + getValor() + " Data de validade: " + this.diausu + "/" + this.mesusu + "/" + this.anousu;
    }
    
}
