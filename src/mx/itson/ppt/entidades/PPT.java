package mx.itson.ppt.entidades;

import java.util.Random;

/**
 *
 * @author Enrique Felix Estrella
 * Clase contenedora de metodos del juego Piedra, Papel o tijera 
 * Desarrolado el dia 10 de Marzo del 2019
 */
public class PPT {
    
    /**
     * Metodo encargado de generar un valor aleatorio con las opciones de juego
     * del contrincante
     * @return un valor aleatorio del enumerador Opcion con las opciones 
     * PIEDRA, PAPEL O TIJERA
     */
    public Opcion generarOpcionContrincante(){
    
        int indice = new Random().nextInt(Opcion.values().length);
        
        return Opcion.values()[indice];
        
    }
    
    /**
     * 
     * @param opcionJugador Se ingresa la opcion que el usuario elige
     * @return un arreglo de objetos con la opcion generada aleatoriamente por 
     * el contrincante y el resultado de juego dado por la opcion ingresada por 
     * el usuario y la opcion generada aleatoriamente
     */
    public Object[] jugarPPT(Opcion opcionJugador){
        
        Opcion opcionContrincante = generarOpcionContrincante();
        
        Resultado resultado = null;
        
        Object[]resultados = new Object[2];
        
        switch (opcionJugador){
        
            case PIEDRA:
                
                if(opcionContrincante==Opcion.PIEDRA){
                        
                    resultado = Resultado.EMPATE;
                    break;
                
                }else if(opcionContrincante==Opcion.PAPEL){
                    
                    resultado = Resultado.PIERDE;
                    break;
            
                }else if(opcionContrincante==Opcion.TIJERA){
                    
                    resultado = Resultado.GANA;
                    break;
                
                }
                
                break;
                
            case PAPEL:
                
                if(opcionContrincante==Opcion.PIEDRA){
                        
                    resultado = Resultado.GANA;
                    break;
                
                }else if(opcionContrincante==Opcion.PAPEL){
                    
                    resultado = Resultado.EMPATE;
                    break;
            
                }else if(opcionContrincante==Opcion.TIJERA){
                    
                    resultado = Resultado.PIERDE;
                    break;
                
                }
                
                break;
            
            case TIJERA:
                
                if(opcionContrincante==Opcion.PIEDRA){
                        
                    resultado = Resultado.PIERDE;
                    break;
                
                }else if(opcionContrincante==Opcion.PAPEL){
                    
                    resultado = Resultado.GANA;
                    break;
            
                }else if(opcionContrincante==Opcion.TIJERA){
                    
                    resultado = Resultado.EMPATE;
                    break;
                
                }
                
                break;
        }
        
        resultados[0] = opcionContrincante;
        resultados[1] = resultado;

        return resultados;
        
    }
    
}
