package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Profissional> profissionais = new ArrayList<>();
    private ArrayList<Projeto> projetos = new ArrayList<>();
    private static int numeroProjeto = 1;

    public ArrayList<Profissional> getProfissionais() {
        return profissionais;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void adicionarProfissional(String cpf, String nome) {
        Profissional profissional = new Profissional();
        profissional.setCpf(cpf);
        profissional.setNome(nome);
        profissionais.add(profissional);
    }

    private boolean isCpfValido(String cpf) {
        return cpf != null && !cpf.isBlank();
    }

    public void removerProfissional(String cpf) {
        if (isCpfValido(cpf)) {
            Profissional excluir = getProfissionalPorCpf(cpf);
            if (excluir != null) {
                profissionais.remove(excluir);
            }
        }
    }

    public Profissional getProfissionalPorCpf(String cpf) {
        if (isCpfValido(cpf)) {
            for (Profissional pro : profissionais) {
                if (cpf.equals(pro.getCpf())) {
                    return pro;
                }
            }
        }
        return null;
    }

    public void adicionarProjetoPublico(String descricao, ArrayList<String> cpfResponsaveis, LocalDate dataInicio, LocalDate dataFim) {
        ProjetoPublico pp = new ProjetoPublico();
        pp.setNumero(numeroProjeto++);
        pp.setDescricao(descricao);
        pp.setDataInclusao(LocalDate.now());
        pp.setDataInicio(dataInicio);
        pp.setDataFim(dataFim);
        for (String cpfResponsavel : cpfResponsaveis) {
            Profissional pro = getProfissionalPorCpf(cpfResponsavel);
            if (pro != null) {
                pp.adicionarResponsavel(pro);
            }
        }
        projetos.add(pp);
    }

    public void adicionarProjetoPrivado(String descricao, ArrayList<String> cpfResponsaveis, double metragem, TipoArea tipoArea) {
        ProjetoPrivado pp = new ProjetoPrivado();
        pp.setNumero(numeroProjeto++);
        pp.setDescricao(descricao);
        pp.setDataInclusao(LocalDate.now());
        pp.setMetragem(metragem);
        pp.setTipoArea(tipoArea);
        for (String cpfResponsavel : cpfResponsaveis) {
            Profissional pro = getProfissionalPorCpf(cpfResponsavel);
            if (pro != null) {
                pp.adicionarResponsavel(pro);
            }
        }
        projetos.add(pp);
    }
}

