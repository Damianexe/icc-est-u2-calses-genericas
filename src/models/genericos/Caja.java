package models.genericos;

public class Caja <T> {
    private T objeto;

    public void guardar (T objetoT){
        this.objeto=objetoT;
    }

    public T obtener () {
        return objeto;
    }

}