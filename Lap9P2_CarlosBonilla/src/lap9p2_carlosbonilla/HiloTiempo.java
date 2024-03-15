/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap9p2_carlosbonilla;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class HiloTiempo implements Runnable {
    private JLabel hora;
    private JLabel dia;
    public HiloTiempo(JLabel hora, JLabel dia) {
        this.hora = hora;
        this.dia=dia;
    }        

    @Override
    public void run() {
        while(true){
            Date h=new Date();
            DateFormat d=new SimpleDateFormat("dd/MM/yy");
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            hora.setText( f.format(h) );
            dia.setText( d.format(h) );
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
        }        
    }
    
}
