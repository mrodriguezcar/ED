public class Videojuegos implements Entregable {

    private String titulo;
    private int horas;
    private boolean entregado;
    private String genero;
    private String comàñia;

    Serie() {
        horas = 10;
        entregado = false;
    }

    Serie(String tit, String cp) {
        titulo = tit;
        horas = 10;
        entregado = false;
        copañia = cp;
    }

    Serie(String tit, int h, String gen, String cp) {
        titulo = tit;
        horas = h;
        genero = gen;
        compañia = cp;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHoras() {
        return horas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setTitulo(String t) {
        titulo = t;
    }

    public void setHoras(int h) {
        numTemp = h;
    }

    public void setGenero(String g) {
        genero = g;
    }

    public void setCompañia(String cp) {
        creador = cp;
    }

}