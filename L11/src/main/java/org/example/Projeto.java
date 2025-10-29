package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Projeto {
    private int numero;
    private LocalDate dataInclusao;
    private String descricao;
    ArrayList<Profissional> responsaveis = new ArrayList<>();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Profissional> getResponsaveis() {
        return responsaveis;
    }

    public void adicionarResponsavel(Profissional responsavel) {
        if (responsaveis.contains(responsavel)) {
            throw new IllegalArgumentException("Profissional ja registrado para o projeto.");
        }
        responsaveis.add(responsavel);
    }

    public void removerResponsavel(String cpf) {
        if (cpf != null && !cpf.isBlank()) {
            Profissional excluir = null;
            for (Profissional prof : responsaveis) {
                if (cpf.equals(prof.getCpf())) {
                    excluir = prof;
                    break;
                }

                if (excluir != null) {
                    responsaveis.remove(excluir);
                }
            }
        }
    }

    public abstract TipoProjeto getTipoProjeto();

    public abstract String getResumo();
}

