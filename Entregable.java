public interface Entregable {

    public void entregar() {
        entregado = true;
    }

    public void devolver() {
        entregado = false;
    }

    public void isEntregado() {
        System.out.println(entregado);
    }

    public void compareTo() {
        
    }

}