package org.example.relatorios;

import org.example.Sistema;

public interface Relatorio {
    int getCodigo();

    void imprimir(Sistema sistema);
}

