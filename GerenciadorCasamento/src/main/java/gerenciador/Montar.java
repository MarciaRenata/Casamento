package gerenciador;

import entidades.Buffet;
import entidades.Cerimonia;
import entidades.Convidado;
import entidades.Fotografo;
import entidades.Localizacao;
import entidades.Presente;
import entidades.Noivo;
import entidades.PresenteCategoria;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Montar
{

    public static Localizacao montarLocal()
    {
        Localizacao l = new Localizacao("lagoa dos gatos", "olinda", "b", "cajueiro", "52040090", 157);
        return l;
    }

    public static Buffet montarBuffet()
    {
        Buffet b = new Buffet("lalalalala", 1.000, 1000, 1000, 700.00);
        return b;
    }

    public static Fotografo montarFotografo()
    {
        Fotografo f = new Fotografo(2.000, "20:00", "3:00", "paulo@hotmail.com", "93250212", "https://www.flickr.com");
        return f;
    }

    public static List<Presente> montarListaPresentes(Cerimonia c)
    {
        Presente p = new Presente(c, "toalha", PresenteCategoria.camaMesaBanho, "capa vermelha", "amazon");
        Presente p1 = new Presente(c, "jogo talheres", PresenteCategoria.cozinha, "capa metalica", "amazon");

        List<Presente> presentes = new ArrayList<Presente>();

        presentes.add(p);
        presentes.add(p1);

        return presentes;
    }

    public static List<Noivo> montarCasal(Cerimonia c)
    {
        Noivo u1 = new Noivo(c, "Clerron", "paulomenzs@gmail.com", "1234");
        Noivo u2 = new Noivo(c, "Natalia", "rayanasls@gmail.com", "5678");

        List<Noivo> usuarios = new ArrayList<Noivo>();

        usuarios.add(u1);
        usuarios.add(u2);

        return usuarios;
    }

    public static List<Convidado> convidarPessoas(Cerimonia c)
    {
        Convidado u1 = new Convidado(c, "Douglas", "paulomenzs@gmail.com", "1234543567");
        Convidado u2 = new Convidado(c, "Edmilson", "rayanasls@gmail.com", "8765456432");

        List<Convidado> convidados = new ArrayList<Convidado>();

        convidados.add(u1);
        convidados.add(u2);

        return convidados;
    }

    public static Cerimonia montarCerimonia(Cerimonia c, Localizacao l, Buffet b, Fotografo f, List<Presente> presentes, List<Noivo> casal, List<Convidado> convidados)
    {
        //transforma uma data String em um date
        Date data = new Date();
        java.sql.Timestamp timestamp = null;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");       
        
        try
        {
            data = df.parse("25/12/1920 12:45:53"); //parse: string pra date ; format: date para string
            timestamp = new java.sql.Timestamp(data.getTime());
        
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }       

        c.setData(timestamp);
        c.setConvidados(convidados);
        c.setBuffet(b);
        c.setFotografo(f);
        c.setLocalizacao(l);
        c.setPresentes(presentes);
        c.setUsuarios(casal);
        
        System.out.println("dataaaaaaaaaaaaaa na cerimonia: " + timestamp);

        return c;
    }
}
