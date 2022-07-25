package br.com.dio.desafio.domain;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    protected double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo=" + getTitulo() +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
