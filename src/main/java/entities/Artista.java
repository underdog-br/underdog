package entities;

public class Artista {
    private final int id;
    private String name;
    private String pais;
    private String estado;
    private String cidade;
    private String genero;
    private int ouvintes;

    public Artista(int id, String name, String pais, String estado, String cidade, String genero, int ouvintes){

        this.id = id;
        this.name = name;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.genero = genero;
        this.ouvintes = ouvintes;


    }

}
