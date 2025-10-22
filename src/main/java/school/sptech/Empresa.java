package school.sptech;

import school.sptech.exception.ArgumentoInvalidoException;
import school.sptech.exception.JogoInvalidoException;
import school.sptech.exception.JogoNaoEncontradoException;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private List<Jogo> jogos;

    public Empresa(String nome, Jogo jogos) {
        this.nome = nome;
        this.jogos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarJogo(Jogo jogo, String codigo, String nome, String genero, Double preco,
                              Double avaliacao, LocalDate dataLancamento) throws JogoInvalidoException {
        if (jogo == null) {
            throw new JogoInvalidoException();
        }
        if (codigo == null || codigo.isEmpty()) {
            throw new JogoInvalidoException();
        }
        if (nome == null || nome.isEmpty()) {
            throw new JogoInvalidoException();
        }
        if (genero == null || genero.isEmpty()) {
            throw new JogoInvalidoException();
        }
        if (preco <= 0 || preco == null) {
            throw new JogoInvalidoException();
        }
        if (avaliacao < 0 || avaliacao > 5) {
            throw new JogoInvalidoException();
        }
        if (dataLancamento.isAfter(dataLancamento) || dataLancamento == null) {
            throw new JogoInvalidoException();
        }
    }

    public Jogo buscarJogoPorCodigo(String codigo) {
        if (codigo == null || codigo.isEmpty() || codigo.isBlank()) {
            throw new ArgumentoInvalidoException();
        }

        for (Jogo j : jogos) {
            if (j.getNome().equalsIgnoreCase(jogos.toString())) {
                throw new JogoNaoEncontradoException();
            }
        }
        return null;
    }

    public void removerJogoPorCodigo(String codigo){
        for (Jogo j : jogos) {
            if (j.getNome().equalsIgnoreCase(jogos.toString())) {
                throw new JogoNaoEncontradoException();
            }
        }
        if (codigo == null || codigo.isEmpty()){
            throw new JogoNaoEncontradoException();
        }
    }

    public Jogo buscarJogoComMelhorAvaliacao(){
        if (jogos.isEmpty()){
            throw new JogoNaoEncontradoException();
        }
        return null;
    }

    public List<Jogo> buscarJogoPorPeriodo(LocalDate dataInicio, LocalDate dataFim){
        if (dataInicio == null || dataFim == null){
            throw new ArgumentoInvalidoException();
        }
        return List.of();
    }
}

