package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fotografo implements Serializable
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
    
    @Column(name = "txt_telefone")
    private String telefone;
    
    @Column(name = "txt_linkParaRedeSocial")
    private String linkParaRedeSocial;

    public Fotografo()
    {
    }

    public Fotografo(double preco, String horaChegada, String horaSaida, String email, String telefone, String linkParaRedeSocial)
    {
        this.preco = preco;
        this.horaChegada = horaChegada;
        this.horaSaida = horaSaida;
        this.email = email;
        this.telefone = telefone;
        this.linkParaRedeSocial = linkParaRedeSocial;
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

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getLinkParaRedeSocial()
    {
        return linkParaRedeSocial;
    }

    public void setLinkParaRedeSocial(String linkParaRedeSocial)
    {
        this.linkParaRedeSocial = linkParaRedeSocial;
    }
    
    
}
