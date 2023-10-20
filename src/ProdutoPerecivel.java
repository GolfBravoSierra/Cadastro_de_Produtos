import java.util.*;
import java.text.*;
class ProdutoPerecivel extends Produto {
    String dataUsuario;


    public ProdutoPerecivel(String descricao , double valor , String dataUsuario) {
        super(descricao , valor);
        this.dataUsuario = dataUsuario;
        
    }
    
    private String getDateTime() {
       // DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
    }


    /*
    public boolean estaVencido(){
        
    }

    public double aplicarDesconto(){
        
    }
    */
}
