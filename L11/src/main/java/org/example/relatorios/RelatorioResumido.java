package org.example.relatorios;

import org.example.Projeto;
import org.example.Sistema;
import org.example.SistemaUtils;

public class RelatorioResumido implements Relatorio {

    @Override
    public int getCodigo() {
        return 4;
    }

    @Override
    public void imprimir(Sistema sistema) {
        System.out.println("---------------------------------------------");
        System.out.println("Relatório resumido de projetos");
        System.out.println("---------------------------------------------");
        System.out.println("Número | Tipo projeto | Data Inclusão");
        System.out.println("---------------------------------------------");
        for (Projeto projeto : sistema.getProjetos()) {
            StringBuilder sb = new StringBuilder();
            sb.append(projeto.getNumero())
                    .append(" | ")
                    .append(projeto.getTipoProjeto())
                    .append(" | ")
                    .append(SistemaUtils.formatarData(projeto.getDataInclusao()))
                    .append(" | ")
            ;
            System.out.println(sb.toString());
        }
        System.out.println("---------------------------------------------");
    }
}
