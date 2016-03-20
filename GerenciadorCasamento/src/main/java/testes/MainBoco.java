package testes;

import java.text.SimpleDateFormat;

public class MainBoco
{
    public static void main(String[] args)
    {
        java.util.Date data = new java.util.Date();        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");       
        
        try
        {
            data = df.parse("25/12/1920 12:45:53"); //parse: string pra date ; format: date para string
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }  
        
        java.sql.Timestamp timestamp = new java.sql.Timestamp(data.getTime());
        
        System.out.println("timestamp: " + timestamp);

    }
}
