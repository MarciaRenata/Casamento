package entidades;

import entidades.Cerimonia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-19T22:58:57")
@StaticMetamodel(Noivo.class)
public class Noivo_ { 

    public static volatile SingularAttribute<Noivo, Integer> id;
    public static volatile SingularAttribute<Noivo, String> email;
    public static volatile SingularAttribute<Noivo, String> telefone;
    public static volatile SingularAttribute<Noivo, String> nome;
    public static volatile SingularAttribute<Noivo, Cerimonia> cerimonia;
    public static volatile SingularAttribute<Noivo, String> senha;

}