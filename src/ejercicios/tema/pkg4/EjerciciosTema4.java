package ejercicios.tema.pkg4;
import javax.swing.JOptionPane;
/**
 *
 * @author anfer
 */
public class EjerciciosTema4 {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de numeroIf"));
        if(numeroIf>0){
            JOptionPane.showMessageDialog(null,"El numero es positivo");
        }
        else if(numeroIf<0){
            JOptionPane.showMessageDialog(null,"El numero es negativo");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es 0");
        }

//---------------------------------------------------------------------------------------------------------------------------------------------------------        
        
        /*
            Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
                -Incrementar el valor de la variable en uno cada vez que se ejecute.
                -Mostrarlo por pantalla cada vez que se ejecute.
        */
        byte numeroWhile = 1;
        while(numeroWhile<3){
            JOptionPane.showMessageDialog(null,"El numeroWhile es: "+numeroWhile);
            numeroWhile++;
        }

//----------------------------------------------------------------------------------------------------------------------------------------------------------
        
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        byte numeroWhile2 = 2;
        do {
            JOptionPane.showMessageDialog(null,"El numeroDoWhile es: "+numeroWhile2);
            numeroWhile2++;
        } while (numeroWhile2<3);
        
//-------------------------------------------------------------------------------------------------------------------------------------------------------        
        
        /*
            Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
            se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        */
        for(byte numeroFor = 0; numeroFor<=3 ; numeroFor++){
            JOptionPane.showMessageDialog(null,"El numeroFor es: "+numeroFor);
        }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------        

        /*
            Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
            Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
            También habrá que poner un default para cuando el valor de la variable no sea una estación.
        */
        byte estacion=Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero dependiendo la estacion del año"));
        switch(estacion){
            case 1:{
                JOptionPane.showMessageDialog(null, "Es Primavera");
            }
            break;
            case 2:{
                JOptionPane.showMessageDialog(null, "Es Verano");
            }
            break;
            case 3:{
                JOptionPane.showMessageDialog(null, "Es Otoño");
            }
            break;
            case 4:{
                JOptionPane.showMessageDialog(null, "Es Verano");
            }
            break;
            default:{
                JOptionPane.showMessageDialog(null, "Solo existen 4 estaciones");
            }
            break;
        }
    }
    
}
