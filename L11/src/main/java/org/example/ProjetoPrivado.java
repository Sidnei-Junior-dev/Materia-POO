package org.example;

public class ProjetoPrivado extends Projeto{
    private TipoArea tipoArea;
    private double metragem;

    public TipoArea getTipoArea(){
        return tipoArea;
    }

    public void setTipoArea(TipoArea tipoarea){
        this.tipoArea = tipoarea;
    }

    public double getMetragem(){
        return metragem;
    }

    public void setMetragem(double metragem){
        this.metragem = metragem;
    }

    @Override
    public TipoProjeto getTipoProjeto(){
        return TipoProjeto.PROJETO_PRIVADO;
    }

    @Override
    public String getResumo(){
        StringBuilder sb = new StringBuilder();
        sb.append(getTipoProjeto()).append(" Numero: ").append(getNumero()).append("\n")
                .append(" Descricao: ").append(getDescricao()).append("\n")
                .append(" Localizacao na : ").append(getTipoArea()).append("\n")
                .append(" Com a area total de : ").append(getMetragem()).append("m2");
        return sb.toString();
    }
}

