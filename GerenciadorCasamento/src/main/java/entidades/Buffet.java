package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Buffet implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String fornecedor;
    
    @Column
    private double valorTotal;
    
    @Column
    private int qtdSalgados;
    
    @Column
    private int qtdDoces;
    
    @Column
    private double valorBolo;

    public Buffet()
    {
    }

    public Buffet(String fornecedor, double valorTotal, int qtdSalgados, int qtdDoces, double valorBolo)
    {
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
        this.qtdSalgados = qtdSalgados;
        this.qtdDoces = qtdDoces;
        this.valorBolo = valorBolo;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFornecedor()
    {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor)
    {
        this.fornecedor = fornecedor;
    }

    public double getValorTotal()
    {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }

    public int getQtdSalgados()
    {
        return qtdSalgados;
    }

    public void setQtdSalgados(int qtdSalgados)
    {
        this.qtdSalgados = qtdSalgados;
    }

    public int getQtdDoces()
    {
        return qtdDoces;
    }

    public void setQtdDoces(int qtdDoces)
    {
        this.qtdDoces = qtdDoces;
    }

    public double getValorBolo()
    {
        return valorBolo;
    }

    public void setValorBolo(double valorBolo)
    {
        this.valorBolo = valorBolo;
    }
    
    
}
