package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Presente implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "txt_nome")
    private String nome;
    
    @Enumerated(EnumType.STRING)
    PresenteCategoria categoria;
    
    @Column(name = "txt_descricao")
    private String descricao;
    
    @Column(name = "txt_ondeEncontrar")
    private String ondeEncontrar;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cerimonia", referencedColumnName = "id")
    private Cerimonia cerimonia;

    public Presente()
    {
    }

    public Presente(Cerimonia c, String nome, PresenteCategoria categoria, String descricao, String ondeEncontrar)
    {     
        this.categoria = categoria;
        this.cerimonia = c;
        this.nome = nome;
        this.descricao = descricao;
        this.ondeEncontrar = ondeEncontrar;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public PresenteCategoria getCategoria()
    {
        return categoria;
    }

    public void setCategoria(PresenteCategoria categoria)
    {
        this.categoria = categoria;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public String getOndeEncontrar()
    {
        return ondeEncontrar;
    }

    public void setOndeEncontrar(String ondeEncontrar)
    {
        this.ondeEncontrar = ondeEncontrar;
    }

    public Cerimonia getCerimonia()
    {
        return cerimonia;
    }

    public void setCerimonia(Cerimonia cerimonia)
    {
        this.cerimonia = cerimonia;
    }

    
   
}
