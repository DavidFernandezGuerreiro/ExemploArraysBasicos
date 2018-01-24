
package exemploarraysbasicos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploArraysBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        float[]temperaturas=new float[7];
         //1.- Damoslle valores elemento a elemento:
//        temperaturas[0]=1.2F;
//        temperaturas[1]=2.2F;
//        temperaturas[2]=3.2F;
//        temperaturas[3]=5.2F;
//        temperaturas[4]=6.2F;
//        temperaturas[5]=7.2F;
//        temperaturas[6]=8.2F;
        Temperatura obxTem=new Temperatura();
//        float []temperaturas={3F,2F,5F,7F}; // 2.- Incialización do Array.
        // 3.- Pedindo datos:
        float []temperaturas=new float[7];
        for(int i=0;i< temperaturas.length;i++){
            temperaturas[i]=Float.parseFloat(JOptionPane.showInputDialog("temperatura"));
        }
        obxTem.amosar(temperaturas);
        
        obxTem.tempDeterminada(temperaturas, 9);
        
        obxTem.buscarTemperatura(temperaturas, 3.3F);
        
//        obxTem.ordenar(temperaturas);
//        obxTem.amosar(temperaturas);
        
        //Ordenado por numero
        Arrays.sort(temperaturas);
        obxTem.amosar(temperaturas);
        
        
        
        
    }
    
}
