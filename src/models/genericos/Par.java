package models.genericos;

public class Par<K, V> {
    private  K clave;
    private V valor;

    public void establecerClave(K clave){
        this.clave = clave;
    }  

    public K obtenerClave(){
        return clave;
    }

    public void establecerValor(V valor){
        this.valor = valor;
    }  

    public V obtenerValor(){
        return valor;
    }

    public K getClave() {
        return clave;
    }
    public void setClave(K clave) {
        this.clave = clave;
    }

    public V getValor() {
        return valor;
    }
    public void setValor(V valor) {
        this.valor = valor;
    }

}
