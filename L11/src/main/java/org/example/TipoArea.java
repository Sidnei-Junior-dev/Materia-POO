package org.example;

public enum TipoArea{
    AREA_RURAL("Area rural"),
    AREA_URBANA("Area urbana");

    private String denominacao;

    private TipoArea(String denominacao){
        this.denominacao = denominacao;
    }

    @Override
    public String toString(){
        return denominacao;
    }
}