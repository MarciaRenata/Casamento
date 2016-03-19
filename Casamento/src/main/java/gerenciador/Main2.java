package gerenciador;

import bancoDeDados.Conexao;
import entidades.Buffet;
import entidades.Cerimonia;
import entidades.Convidado;
import entidades.Fotografo;
import entidades.Localizacao;
import entidades.Presente;
import entidades.Noivos;
import java.util.List;

public class Main2
{

    //faz um find, com as coisas do banco, joga na cerimonia nova
    public static void main(String[] args)
    {

        try
        {
            Localizacao l = Conexao.getEntityManager().find(Localizacao.class, 1);
            Buffet b = Conexao.getEntityManager().find(Buffet.class, 1);
            Fotografo f = Conexao.getEntityManager().find(Fotografo.class, 1);

            Cerimonia c = new Cerimonia();

            List<Presente> presentes = Montar.montarListaPresentes(c);
            List<Noivos> casal = Montar.montarCasal(c);
            List<Convidado> convidados = Montar.convidarPessoas(c);

            c = Montar.montarCerimonia(c, l, b, f, presentes, casal, convidados);

            Conexao.getEntityManager().getTransaction().begin();
            Conexao.getEntityManager().persist(c);
            Conexao.getEntityManager().getTransaction().commit();

        } catch (Exception e)
        {
            Conexao.getEntityManager().getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
