package entidades;

import entidades.Buffet;
import entidades.Loja;
import enumeracoes.ComidaBebidaCategoria;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-23T21:32:43")
@StaticMetamodel(ComesBebes.class)
public class ComesBebes_ { 

    public static volatile SingularAttribute<ComesBebes, Integer> id;
    public static volatile SingularAttribute<ComesBebes, ComidaBebidaCategoria> categoria;
    public static volatile SingularAttribute<ComesBebes, Buffet> buffet;
    public static volatile SingularAttribute<ComesBebes, Loja> loja;
    public static volatile SingularAttribute<ComesBebes, Integer> qtd;

}