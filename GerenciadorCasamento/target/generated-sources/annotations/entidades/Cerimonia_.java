package entidades;

import entidades.Buffet;
import entidades.Convidado;
import entidades.Localizacao;
import entidades.Noivo;
import entidades.Presente;
import entidades.ProdutorDeMidia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-21T17:59:34")
@StaticMetamodel(Cerimonia.class)
public class Cerimonia_ { 

    public static volatile SingularAttribute<Cerimonia, Integer> id;
    public static volatile SingularAttribute<Cerimonia, Buffet> buffet;
    public static volatile ListAttribute<Cerimonia, Convidado> convidados;
    public static volatile ListAttribute<Cerimonia, ProdutorDeMidia> equipeDeMidia;
    public static volatile SingularAttribute<Cerimonia, Date> dataHora;
    public static volatile SingularAttribute<Cerimonia, Localizacao> localizacao;
    public static volatile ListAttribute<Cerimonia, Presente> presentes;
    public static volatile ListAttribute<Cerimonia, Noivo> usuarios;

}