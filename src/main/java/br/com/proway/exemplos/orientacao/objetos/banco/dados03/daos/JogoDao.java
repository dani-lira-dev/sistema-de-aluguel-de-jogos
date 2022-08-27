package br.com.proway.exemplos.orientacao.objetos.banco.dados03.daos;

// DAO: Data Access Object (representação do objeto contido em tabela)
public class JogoDao {
    // Atributos
    private int id;
    private String nome;
    private String tipo;
    
    // Método chamado quando o objeto jogo é apresentado.
    // Representação do objeto.
    @Override
    public String toString(){
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
