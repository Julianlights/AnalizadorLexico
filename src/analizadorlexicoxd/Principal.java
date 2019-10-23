/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexicoxd;

import java.io.File;

/**
 *
 * @author Jorge Julian Sanchez
 */
public class Principal {
    public static void main(String[] args){
        String ruta = "C:/Users/Jorge Julian Sanchez/Documents/NetBeansProjects/AnalizadorLexicoXD/src/analizadorlexicoxd/Lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        jflex.Main.generate(archivo);
    }
}
