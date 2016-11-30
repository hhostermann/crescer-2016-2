/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cwi.crescer.locadora;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author henrique.ostermann
 */
@Entity
@Table(name = "FILME")
public class Filme {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_FILME")
    @SequenceGenerator(name = "SEQ_FILME", sequenceName = "SEQ_FILME", allocationSize = 1)
    @Basic(optional = false)
    @Column(name = "ID_FILME")
    private Long idPessoa;
    
    @Basic(optional = false)
    @Column(name = "TITULO_FILME")
    private String nomeFilme;
    
    @Basic(optional = false)
    @Column(name = "DIRETOR_FILME")
    private String diretorFilme;
    
    
    
    
    
        
}
    @Basic(optional = false)
    @Column(name = "NM_PESSOA")
    private String nmPessoa;
    
    @Column(name = "DT_NASCIMENTO", nullable = true)
    @Temporal(DATE)
    @Basic(optional = true)
    private Date dtNascimento;

    @OneToMany(cascade = ALL)
    private List<Filho> filhos;
    
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

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public List<Filho> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<Filho> filhos) {
        this.filhos = filhos;
    }
