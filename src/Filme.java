import java.time.Year;

public class Filme implements Comparable<Filme>{
    private String titulo;
    private String UrlImagem;
    private Double nota;
    private int ano;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getUrlImagem() {
        return UrlImagem;
    }
    public void setUrlImagem(String urlImagem) {
        UrlImagem = urlImagem;
    }
    public Double getNota() {
        return nota;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    } 

    @Override
    public String toString() {
        return this.titulo + "(" +ano+")\n";
    }
    @Override
    public int compareTo(Filme o) {
        return this.getTitulo().compareTo(o.getTitulo());
    }


    
}
