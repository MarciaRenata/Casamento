package entidades;

import entidades.Cerimonia;
import entidades.Telefone;
import enumeracoes.ProdutorDeMidiaCategoria;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-21T20:40:41")
@StaticMetamodel(ProdutorDeMidia.class)
public class ProdutorDeMidia_ { 

    public static volatile SingularAttribute<ProdutorDeMidia, Integer> id;
    public static volatile SingularAttribute<ProdutorDeMidia, ProdutorDeMidiaCategoria> categoria;
    public static volatile SingularAttribute<ProdutorDeMidia, Double> preco;
    public static volatile SingularAttribute<ProdutorDeMidia, String> email;
    public static volatile ListAttribute<ProdutorDeMidia, Telefone> telefones;
    public static volatile SingularAttribute<ProdutorDeMidia, String> linkParaRedeSocial;
    public static volatile SingularAttribute<ProdutorDeMidia, Cerimonia> cerimonia;
    public static volatile SingularAttribute<ProdutorDeMidia, Date> dataEHoraChegada;

}