package br.com.projectgerir.model.bean;

/**
 *
 * @author kaiqu
 */
public class Categoria{
    private int id;
    private String nomeCategoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    @Override
    public String toString() {
        return getNomeCategoria();
    } 
}
