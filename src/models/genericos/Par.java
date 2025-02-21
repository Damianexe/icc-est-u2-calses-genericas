package models.genericos;

public class Par <K,V>{
    private K clave;
    private V valor;

    public Par(){
        
    }    
    public Par(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public void establecerClave(K clave){
        this.clave=clave;
    }

    public void establecerValor(V Valor){
        this.valor=valor;
    }

    public K obtenerClave() {
        return clave;
    }


    public V obtenerValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "Par [clave=" + clave + ", valor=" + valor + "]";
    }
    
    
}
