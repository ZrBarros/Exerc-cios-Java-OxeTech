package ToDo;

public class Tarefas {
    private String nome, descricao, categoria;
    private boolean feito;

    Tarefas (String nome, String descricao, String categoria){
        this.nome = nome;
        this.descricao = descricao;
        this.feito = false;
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    public boolean isFeito() {
        return feito;
    }
    public void setFeito(boolean feito) {
        this.feito = feito;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getNome() {
        return nome;
    }
}
