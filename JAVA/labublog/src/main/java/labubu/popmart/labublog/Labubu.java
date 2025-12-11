package labubu.popmart.labublog;

public class Labubu {

    private Integer idLabubu;
    private String nome;
    private String senha;

    public Labubu(Integer idLabubu, String nome, String senha) {
        this.idLabubu = idLabubu;
        this.nome = nome;
        this.senha = senha;
    }

    public Labubu(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Labubu() {
    }

    public Integer getIdLabubu() {
        return idLabubu;
    }

    public void setIdLabubu(Integer idLabubu) {
        this.idLabubu = idLabubu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}