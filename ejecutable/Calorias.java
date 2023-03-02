package ejecutable;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Calorias
{
    public static void main(String[] args) {
        int calorias[], media=0, max=0, min=0, temp, dm=0, d=0;
        calorias = new int [7];
        String[] semana = new String[]{"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};

        for (int i=0; i<calorias.length; i++)
        {
            calorias[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingresa las calorias del día "+ semana[i]));
            media=calorias[i]+media;
        }
        
        temp=media/calorias.length;

        for (int i=0; i<calorias.length; i++)
        {
            if (calorias[i]>max)
            {
                max=calorias[i];
                d=i;
            }
        }
        min=calorias[0];
        for (int i=0; i<calorias.length; i++)
        {

            if (min>calorias[i])
            {
                min=calorias[i];
                dm=i;
            }
        }
        
            JOptionPane.showMessageDialog(null,"Las calorías consumidas en la semana fueron: "+ Arrays.toString(calorias));
            JOptionPane.showMessageDialog(null,"El Promedio de calorías de la semana es: "+ temp + " calorias " );
            JOptionPane.showMessageDialog(null," El día de más calorías consumidas en la semana fue el: "+semana[d]+" con "+max+" calorias" );
            JOptionPane.showMessageDialog(null," El día de menos calorías consumidas en la semana fue el: "+semana[dm]+" con "+min+" calorias" );
            Arrays.sort(calorias);
            JOptionPane.showMessageDialog(null, "El orden ascendente de las calorías es: "+ Arrays.toString(calorias));
        
        
    
        // Fin
        System.exit(0);

    };

}