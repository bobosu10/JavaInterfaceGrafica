// Estrutura MVC para Gerenciamento de Cursos em Java

// ===========================
// MODEL
// ===========================

package Model;

/**
 * Classe que representa um Curso.
 */

public class Curso {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private String cordenador;
    private String area;

    public Curso(String area, int cargaHoraria, String codigo, String cordenador, String nome) {
        this.area = area;
        this.cargaHoraria = cargaHoraria;
        this.codigo = codigo;
        this.cordenador = cordenador;
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCordenador() {
        return cordenador;
    }

    public void setCordenador(String cordenador) {
        this.cordenador = cordenador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
