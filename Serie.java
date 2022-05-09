public class Serie implements Entregable{

    private String titulo;
    private int numTemp;
    private boolean entregado;
    private String genero;
    private String creador;

    Serie() {
        numTemp = 3;
        entregado = false;
    }

    Serie(String tit, String cr) {
        titulo = tit;
        numTemp = 3;
        entregado = false;
        creador = cr;
    }

    Serie(String tit, int nt, String gen, String cr) {
        titulo = tit;
        numTemp = nt;
        genero = gen;
        creador = cr;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumTemp() {
        return numTemp;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String t) {
        titulo = t;
    }

    public void setNumTemp(int nt) {
        numTemp = nt;
    }

    public void setGenero(String g) {
        genero = g;
    }

    public void setCreador(String cr) {
        creador = cr;
    }

}
