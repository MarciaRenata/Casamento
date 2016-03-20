package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Localizacao implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "txt_logradouro")
    private String logradouro;

    @Column(name = "txt_bairro")
    private String bairro;

    @Column(name = "txt_cidade")
    private String cidade;
    
    @Column(name = "txt_complemento")
    private String complemento;

    @Column(name = "txt_cep")
    private String cep;

    @Column(name = "numero_numero")
    private int numero;

    public Localizacao()
    {
    }

    public Localizacao(String logradouro, String cidade, String bairro, String complemento, String cep, int numero)
    {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.cep = cep;
        this.numero = numero;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getRua()
    {
        return logradouro;
    }

    public void setRua(String logradouro)
    {
        this.logradouro = logradouro;
    }

    public String getBairro()
    {
        return bairro;
    }

    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    public String getCep()
    {
        return cep;
    }

    public void setCep(String cep)
    {
        this.cep = cep;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getLogradouro()
    {
        return logradouro;
    }

    public void setLogradouro(String logradouro)
    {
        this.logradouro = logradouro;
    }

    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public String getComplemento()
    {
        return complemento;
    }

    public void setComplemento(String complemento)
    {
        this.complemento = complemento;
    }
    
    
    
}
