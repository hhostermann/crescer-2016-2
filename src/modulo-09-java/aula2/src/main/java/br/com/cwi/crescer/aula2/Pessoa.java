package br.com.cwi.crescer.aula2;

/**
 * @author Carlos H. Nonnemacher
 */
public class Pessoa {

    private Long idPessoa;
    private String nmPessoa;

    Pessoa(long idPessoa, String nmPessoa) {
        this.idPessoa = idPessoa;
        this.nmPessoa = nmPessoa;
    }

    Pessoa() {
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

}
