import java.util.regex.Pattern;

/**
 * Classe con
 */
public class StringaEstesa {

    private String value;

    //// COTRUTTORI ////

    /**
     * Costruttore di default
     */
    public StringaEstesa(){
        value = null;
    }

    /**
     * Costruttore con parametro
     * @param value Valore della Stringa
     */
    public StringaEstesa(String value){
        this.value = value;
    }


    ///// METODI /////

    /**
     * Metodo per il controllo della stringa se vuota
     * @return Ritorna True se il valore della stringa è vuota o null
     */
    public boolean isEmpty(){
        return value == null || value == "";
    }


    /**
     * Metodo per il controllo della stringa ha spazi o è vuota
     * Uso per gli spazi la regular expession per il controllo sugli spazi della stringa
     * @return Ritorna true se la stringa contiene spazi o è vuota o è null
     */
    public boolean isBlank(){
        return value.matches("^(\s)$") || value == "" || value == null;
    }


    /**
     * Metodo che controlla se la stringa è fotmata da soli numeri
     * Uso la regular expression per il controllo sulla stringa
     * @return Ritorna true se la stringa è composta da numeri
     */
    public boolean isNumeric(){
        return value.matches("\\d+");
    }  //^(\(?\+?[0-9]*\)?)?[0-9_\- \(\)]*$


    /**
     * Getter Value
     * @return Il valore della stringa Value
     */
    public String getValue(){
        return this.value;
    }

}
