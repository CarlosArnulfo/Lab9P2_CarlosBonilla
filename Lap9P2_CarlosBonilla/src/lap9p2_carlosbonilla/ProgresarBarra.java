/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap9p2_carlosbonilla;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author lospe
 */
public class ProgresarBarra implements Runnable{
    private JProgressBar barra;
    private String archivo;
    private JTextArea tf;
public ProgresarBarra(JProgressBar barra,String archivo,JTextArea tf) {
        this.barra = barra;
        this.archivo=archivo;
        this.tf=tf;
    }
    
    
    
    @Override
    public void run(){
        int i=0;
        barra.setMaximum(10);
        while(i<=10){
            
            barra.setValue(i);
                    i++;
                    try {
                Thread.sleep(100);
            }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
        }
        this.tf.setText(archivo);
        
    }
}
