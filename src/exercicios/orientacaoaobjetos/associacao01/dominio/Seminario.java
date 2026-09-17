package exercicios.orientacaoaobjetos.associacao01.dominio;

/**
 * <b>Crie um sistema que gerencie seminários:</b>
 * <p>O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado.</p>
 * <p>- Um aluno poderá estar em apenas um seminário;</p>
 * <p>- Um seminário poderá ter nenhum ou vários alunos;</p>
 * <p>- Um professor poderá ministrar vários seminários;</p>
 * <p>- Um seminário deve ter um local.</p>
 * <p></p>
 * <p><b>Campos Básicos (excluindo relacionamento)</b></p>
 * <p>- Seminário: título</p>
 * <p>- Aluno: nome e idade</p>
 * <p>- Professor: nome e especialidade</p>
 * <p>- Local: endereço</p>
 */
public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }
    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local){
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
