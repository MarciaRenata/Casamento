package entidades;

import entidades.Cerimonia;
import entidades.Telefone;
import enumeracoes.ConvidadoCategoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-23T21:32:43")
@StaticMetamodel(Convidado.class)
public class Convidado_ { 

    public static volatile SingularAttribute<Convidado, Integer> id;
    public static volatile SingularAttribute<Convidado, ConvidadoCategoria> categoria;
    public static volatile SingularAttribute<Convidado, String> email;
    public static volatile ListAttribute<Convidado, Telefone> telefones;
    public static volatile SingularAttribute<Convidado, String> nome;
    public static volatile SingularAttribute<Convidado, Cerimonia> cerimonia;

}