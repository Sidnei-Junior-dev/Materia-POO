package org.example.relatorios;

import org.example.Sistema;

public class RelatorioNovo implements Relatorio {
    @Override
    public int getCodigo() {
        return 5;
    }

    @Override
    public void imprimir(Sistema sistema) {
        System.out.println("Novo relatorio");
    }
}
