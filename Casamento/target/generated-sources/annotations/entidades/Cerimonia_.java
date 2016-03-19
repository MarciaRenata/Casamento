package entidades;

import entidades.Buffet;
import entidades.Fotografo;
import entidades.Localizacao;
import entidades.Presente;
import entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-13T12:35:13")
@StaticMetamodel(Cerimonia.class)
public class Cerimonia_ { 

    public static volatile SingularAttribute<Cerimonia, Integer> id;
    public static volatile SingularAttribute<Cerimonia, String> horaInicio;
    public static volatile SingularAttribute<Cerimonia, Localizacao> id_localizacao;
    public static volatile SingularAttribute<Cerimonia, String> horaFim;
    public static volatile SingularAttribute<Cerimonia, String> dataCerimonia;
    public static volatile SingularAttribute<Cerimonia, Buffet> id_buffet;
    public static volatile SingularAttribute<Cerimonia, Fotografo> id_fotografo;
    public static volatile ListAttribute<Cerimonia, Presente> presentes;
    public static volatile ListAttribute<Cerimonia, Usuario> usuarios;

}