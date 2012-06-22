package Domain.Application;


public class StringHelper {

    public static boolean estaNulaOuVazia(String texto){
        
        return texto == null || texto.trim().equals("");
    }
}
