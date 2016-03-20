package entidades;

import entidades.Cerimonia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-19T22:58:57")
@StaticMetamodel(Presente.class)
public class Presente_ { 

    public static volatile SingularAttribute<Presente, Integer> id;
    public static volatile SingularAttribute<Presente, String> categoria;
    public static volatile SingularAttribute<Presente, String> nome;
    public static volatile SingularAttribute<Presente, String> ondeEncontrar;
    public static volatile SingularAttribute<Presente, Cerimonia> cerimonia;
    public static volatile SingularAttribute<Presente, String> descricao;

}