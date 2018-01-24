
package exemploarraysbasicos;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Temperatura {
    public void amosar(float[]temp){
        for(int i=0;i< temp.length;i++){
            System.out.println("Temperatura "+(i+1)+" ---> "+temp[i]);
        }
    }
    
    //Saber a tempertatura dunha determinada posición
    public void tempDeterminada(float[]tem,int posicion){
        while(posicion<1||posicion>tem.length){ //Valida el numero de posicion. Menor que 1 o mayor que 7.
            posicion=Integer.parseInt(JOptionPane.showInputDialog("Número invalido"));
        }
        System.out.println("A temperatura = "+tem[posicion-1]);
    }
    
    //Buscar una temperatura
    public void buscarTemperatura(float[]tem,float temAtopar){
        boolean atopado=false;
        for(int i=0;i<tem.length;i++)
            if(temAtopar==tem[i]){
                System.out.println("Posición = "+(i+1));
                atopado=true;
            }
            if(atopado==false)
                System.out.println(temAtopar+" non está ");
        
    }
    
    //Ordenar por numero:
    public void ordenar(float[]tem){
        int i,j;
        float aux;
        for(i=0;i<tem.length;i++)
            for(j=i+1;j<tem.length;j++){
                if(tem[i]>tem[j]){
                    aux=tem[1];
                    tem[i]=tem[j];
                    tem[j]=aux;
                }
            }
    }
    
}
