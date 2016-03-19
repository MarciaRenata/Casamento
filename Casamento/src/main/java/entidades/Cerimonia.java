package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cerimonia implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String horaInicio;
    
    @Column
    private String horaFim;
    
    @Column
    private String dataCerimonia; //mudar para date   
    
    //Relacionamentos:
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_localizacao", referencedColumnName = "id")
    private Localizacao id_localizacao;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_buffet", referencedColumnName = "id")
    private Buffet id_buffet;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_fotografo", referencedColumnName = "id")
    private Fotografo id_fotografo;
    
    //lista de presentes que o casal cria
    @OneToMany(mappedBy = "cerimonia", fetch = FetchType.LAZY, 
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Presente> presentes;
    
    //uma cerimonia to many usuarios, pois o casal pode editar a cerimonia
    @OneToMany(mappedBy = "cerimonia", fetch = FetchType.LAZY, 
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Usuario> usuarios;
    
    //uma cerimonia to many usuarios, pois o casal pode editar a cerimonia
    @OneToMany(mappedBy = "cerimonia", fetch = FetchType.LAZY, 
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Convidado> convidados;

    public Cerimonia()
    {
    }

    public Cerimonia(String horaInicio, String horaFim, String dataCerimonia, Localizacao id_localizacao, Buffet id_buffet, Fotografo id_fotografo, List<Presente> presentes, List<Usuario> usuarios, List<Convidado> convidados)
    {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.dataCerimonia = dataCerimonia;
        this.id_localizacao = id_localizacao;
        this.id_buffet = id_buffet;
        this.id_fotografo = id_fotografo;
        this.presentes = presentes;
        this.usuarios = usuarios;
        this.convidados = convidados;
    }

    

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getHoraInicio()
    {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio)
    {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim()
    {
        return horaFim;
    }

    public void setHoraFim(String horaFim)
    {
        this.horaFim = horaFim;
    }

    public String getDataCerimonia()
    {
        return dataCerimonia;
    }

    public void setDataCerimonia(String dataCerimonia)
    {
        this.dataCerimonia = dataCerimonia;
    }

    public Localizacao getId_localizacao()
    {
        return id_localizacao;
    }

    public void setId_localizacao(Localizacao id_localizacao)
    {
        this.id_localizacao = id_localizacao;
    }

    public Buffet getId_buffet()
    {
        return id_buffet;
    }

    public void setId_buffet(Buffet id_buffet)
    {
        this.id_buffet = id_buffet;
    }

    public Fotografo getId_fotografo()
    {
        return id_fotografo;
    }

    public void setId_fotografo(Fotografo id_fotografo)
    {
        this.id_fotografo = id_fotografo;
    }

    public List<Presente> getPresentes()
    {
        return presentes;
    }

    public void setPresentes(List<Presente> presentes)
    {
        this.presentes = presentes;
    }

    public List<Usuario> getUsuarios()
    {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios)
    {
        this.usuarios = usuarios;
    } 

    public List<Convidado> getConvidados()
    {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados)
    {
        this.convidados = convidados;
    }
}
