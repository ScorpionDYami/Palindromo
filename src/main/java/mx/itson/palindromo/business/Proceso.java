/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindromo.business;

/**
 * La clase contiene todas las operaciones necesarias para comprobar si
 * una cadena contiene un palíndromo
 * @author Kevin
 */
public class Proceso {
    
    /**
     * El método invierte la variable "cadena" de tipo String convirtiendo
     * la cadena en un arreglo de tipo char e invirtiendo la posición 
     * de cada índice.
     * @param cadena Es el texto que se desea invertir.
     * @return Una cadena de texto invertida con respecto a la original.
     */
    protected static String invertirCadena(String cadena){
        
        char[] letras = new char[cadena.length()];
        
        for(int i=0; i < cadena.length(); i++){
            letras[i] = cadena.charAt(cadena.length()-1-i);
        }
        
        return new String(letras);
    }
    
    /**
     * El método toma una cadena de texto y elimina las letras con acento, 
     * intercambiandolas con su contraparte sin acento.
     * @param cadena Es el texto que se va a evaluar si es que contiene caracteres 
     * con acento.
     * @return Una cadena de texto sin acentos.
     */
    protected static String quitarAcentos(String cadena){
       
        String[] conAcento = {"á", "é", "í", "ó", "ú", "ü", "ñ", "Á", "É", "Í", "Ó", "Ú", "Ü", "Ñ"};
        String[] sinAcento = {"a", "e", "i", "o", "u", "u", "n", "A", "E", "I", "O", "U", "U", "N"};
        
        for(int i=0; i < conAcento.length; i++){
            cadena = cadena.replaceAll(conAcento[i], sinAcento[i]);
        }
        
        return cadena;
    }
    
    /**
     * El método elimina todo aquello que no sea considerado un caracter del
     * alfabeto (no se aceptan letras acentuadas).
     * @param cadena Es el texto al cual se le desea eliminar todo aquello que no sea 
     * una letra comprendida en el siguiente rango [a-zA-Z].
     * @return Una cadena de texto limpia con solo valores alfabeticos sin acentuación.
     */
    protected static String limpiarCadena(String cadena){
        
        cadena = quitarAcentos(cadena);
        cadena = cadena.replaceAll("\\W+", "").replaceAll("\\d+", "").replaceAll("\\_", "").toLowerCase();
        
        return cadena;
    }
    
    /**
     * El método evalua si la cadena de texto es un palíndromo
     * @param cadena La cadena de texto a evaluar.
     * @return Valor booleano (true o false).
     */
    public static boolean esPalindromo(String cadena){
        String cadenaLimpia = limpiarCadena(cadena);
        String cadenaInvertida = invertirCadena(cadenaLimpia);
        
        return cadenaLimpia.equals(cadenaInvertida);
    }
    
}
