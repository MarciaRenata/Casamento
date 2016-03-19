package gerenciador;

import entidades.Buffet;
import entidades.Cerimonia;
import entidades.Convidado;
import entidades.Fotografo;
import entidades.Localizacao;
import entidades.Presente;
import entidades.Noivos;
import java.util.ArrayList;
import java.util.List;

public class Montar
{
    public static Localizacao montarLocal()
    {
        Localizacao l = new Localizacao("Rua serinhanhem", "olinda", "52040090", 157);
        return l;
    }
    
    public static Buffet montarBuffet()
    {
        Buffet b = new Buffet("lalalalala", 1.000, 1000, 1000, 700.00);
        return b;
    }
    
    public static Fotografo montarFotografo()
    {
        Fotografo f = new Fotografo(2.000, "20:00", "3:00", "rayana@hotmail.com", "93250212", "https://www.flickr.com");
        return f;
    }

    public static List<Presente> montarListaPresentes(Cerimonia c)
    {
        Presente p = new Presente(c, "casa", "misterio", "capa vermelha", "amazon");
        Presente p1 = new Presente(c, "carro", "romance", "capa metalica", "amazon");
        
        List<Presente> presentes = new ArrayList<Presente>();
        
        presentes.add(p);
        presentes.add(p1);
        
        return presentes;
    }
    
    public static List<Noivos> montarCasal(Cerimonia c)
    {
        Noivos u1 = new Noivos(c, "Clerron", "paulomenzs@gmail.com", "1234");
        Noivos u2 = new Noivos(c, "Natalia", "rayanasls@gmail.com", "5678");
        
        List<Noivos> usuarios = new ArrayList<Noivos>();
        
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
    
    public static Cerimonia montarCerimonia(Cerimonia c, Localizacao l, Buffet b, Fotografo f, List<Presente> presentes, List<Noivos> casal, List<Convidado> convidados)
    {
        
        c.setConvidados(convidados);
        c.setDataCerimonia("10/03");
        c.setHoraFim("00:00");
        c.setHoraInicio("16:00");
        c.setId_buffet(b);
        c.setId_fotografo(f);
        c.setId_localizacao(l);
        c.setPresentes(presentes);
        c.setUsuarios(casal);
        
       return c;        
    } 
}
