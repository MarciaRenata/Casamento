package bancoDeDados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao
{
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getEntityManager()
    {
        if (em == null)
        {
            emf = Persistence.createEntityManagerFactory("casamento");
            em = emf.createEntityManager();
        } 

        return em;
    }

    public static void fecharConexao()
    {
        if (em != null)
        {
            try
            {
                em.close();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        else System.out.println("Sem conexão com o bando de dados");
    }
}
