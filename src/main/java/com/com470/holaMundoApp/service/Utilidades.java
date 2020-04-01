package com.com470.holaMundoApp.service;

/**
 *
 * @author Juan Carlos
 */
public class Utilidades {

    public String concatenar(String uno, String dos) {
        if (uno != null && dos != null) {
            return uno.concat(" ").concat(dos);
        }
        return null;
    }

    /*ejemplo
    "a","b","c" --> String [] array ={"a","b","c"};
    array[0]="a"
    array[1]="b"
    array[2]="c"
     */
    //creamos un metodo que recibe como parametro un varargs, numero indeterminado de variables String
    public String[] getArrayStrings(String... strings) {
        String[] array = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            array[i] = strings[i];
        }
        return array;
    }

    public boolean esMayorQue10(int num) {
        if (num > 10) {
            return true;
        }
        return false;
    }
}
