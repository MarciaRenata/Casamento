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

public class Main {
//abre conexao com o banco
//cria as entidades
//operacoes no banco

    /*
        1- Cria local, buffet, fotografo 
        2- Cria lista de presentes, lista de usuarios 
        3- Cria cerimonia - seta tudo na cerimonia 
        4- salva cerimonia
     */
//fecha conexao

    public static void main(String[] args) {
        Localizacao l = Montar.montarLocal();
        Buffet b = Montar.montarBuffet();
        Fotografo f = Montar.montarFotografo();

        Cerimonia c = new Cerimonia();

        List<Presente> presentes = Montar.montarListaPresentes(c);
        List<Noivos> casal = Montar.montarCasal(c);
        List<Convidado> convidados = Montar.convidarPessoas(c);

       
        
        c = Montar.montarCerimonia(c, l, b, f, presentes, casal, convidados);

        try {
            Conexao.getEntityManager().getTransaction().begin();
            Conexao.getEntityManager().persist(c);
            Conexao.getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            Conexao.getEntityManager().getTransaction().rollback();
            e.printStackTrace();
        }
        
        System.out.println("Id cerimonia : " + c.getId());
        System.out.println("Id usuario : " + casal.get(0).getId());

        Conexao.fecharConexao();
    }
}
