package entidades;

import entidades.Localizacao;
import entidades.Presente;
import entidades.Telefone;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-21T17:59:34")
@StaticMetamodel(Loja.class)
public class Loja_ { 

    public static volatile SingularAttribute<Loja, Integer> id;
    public static volatile SingularAttribute<Loja, Telefone> telefone;
    public static volatile SingularAttribute<Loja, String> nome;
    public static volatile SingularAttribute<Loja, Presente> presente;
    public static volatile SingularAttribute<Loja, Localizacao> localizacao;

}