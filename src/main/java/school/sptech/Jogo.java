package school.sptech;

import java.time.LocalDate;

public class Jogo {
    private String codigo;
    private String nome;
    private String genero;
    private Double preco;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Jogo(String codigo, String nome, String genero, Double preco,
                Double avaliacao, LocalDate dataLancamento){
        this.codigo = codigo;
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.dataLancamento = dataLancamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getAvaliacaoDescricao() {
        if (avaliacao >= 4.5) {
            System.out.println("EXCELENTE");
        } else if (avaliacao >= 3.5) {
            System.out.println("BOM");
        } else if (avaliacao >= 2.5) {
            System.out.println("REGULAR");
        } else {
            System.out.println("RUIM");
        }
        return "";
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
