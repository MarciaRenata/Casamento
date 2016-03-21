package entidades;

import enumeracoes.ProdutorDeMidiaCategoria;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;

@Entity
public class ProdutorDeMidia implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "numero_preco")
    private double preco;
    
    @Column(name = "txt_horaChegada")
    private String horaChegada;
    
    @Column(name = "txt_horaSaida")
    private String horaSaida;
    
    @Column(name = "txt_email")
    private String email;
    
    @Column(name = "txt_linkParaRedeSocial")
    private String linkParaRedeSocial;
    
    @Enumerated(EnumType.STRING)
    ProdutorDeMidiaCategoria categoria;    
    
    @OneToMany(mappedBy = "produtorDeMidia", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Telefone> telefones;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cerimonia", referencedColumnName = "id")
    private Cerimonia cerimonia;

    public ProdutorDeMidia()
    {
        telefones = new ArrayList<>();
    }

    public ProdutorDeMidia(Cerimonia c, ProdutorDeMidiaCategoria categoria, double preco, String horaChegada, String horaSaida, String email, String linkParaRedeSocial)
    {
        this.cerimonia = c;
        this.categoria = categoria;
        this.preco = preco;
        this.horaChegada = horaChegada;
        this.horaSaida = horaSaida;
        this.email = email;
        this.linkParaRedeSocial = linkParaRedeSocial;
        
        telefones = new ArrayList<>();
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    public String getHoraChegada()
    {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada)
    {
        this.horaChegada = horaChegada;
    }

    public String getHoraSaida()
    {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida)
    {
        this.horaSaida = horaSaida;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getLinkParaRedeSocial()
    {
        return linkParaRedeSocial;
    }

    public void setLinkParaRedeSocial(String linkParaRedeSocial)
    {
        this.linkParaRedeSocial = linkParaRedeSocial;
    }

    //PADRAO EXPERT
    public void setTelefones(List<Telefone> telefonesNovos)
    {
        
        for (Telefone telefone : telefonesNovos)
        {
            if(!telefones.contains(telefone))
            {
                telefones.add(telefone);
            }
        }
    }
    
    public List<Telefone> getTelegones()
    {
        return telefones;
    }

    public ProdutorDeMidiaCategoria getCategoria()
    {
        return categoria;
    }

    public void setCategoria(ProdutorDeMidiaCategoria categoria)
    {
        this.categoria = categoria;
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
