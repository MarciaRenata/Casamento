package entidades;

import entidades.Convidado;
import entidades.ProdutorDeMidia;
import enumeracoes.TelefoneCategoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-21T17:59:34")
@StaticMetamodel(Telefone.class)
public class Telefone_ { 

    public static volatile SingularAttribute<Telefone, Integer> id;
    public static volatile SingularAttribute<Telefone, TelefoneCategoria> categoria;
    public static volatile SingularAttribute<Telefone, Convidado> convidado;
    public static volatile SingularAttribute<Telefone, String> ddd;
    public static volatile SingularAttribute<Telefone, String> numero;
    public static volatile SingularAttribute<Telefone, ProdutorDeMidia> produtorDeMidia;

}