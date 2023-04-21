/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.desenho;

/**
 *
 * @author 1091392223010
 */

// Utilizando DrawLine para conectar os cantos de um painel
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel { 
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth(); // largura total 
        int height = getHeight(); // altura total
        
        // desenha uma linha a partir do canto superior esquerdo até o inferior direito
//        g.drawLine(0, 0, width, height);        
        // desenha uma linha a partir do canto inferior esquerdo até o superior direito
//        g.drawLine(0, height, width, 0);
        
        // desenha uma linha a partir do meio superior até o meio inferior
//        g.drawLine(width/2, 0, width/2, height );
        
        // desenha uma linha a partir do meio lateral esquerdo até o meio lateral direito
//        g.drawLine(0, height/2, width, height/2 );
        
        for (int i = 0; i <= width; i+=20) {
            g.drawLine(0, 0, i, height/2);
        }
    }
    
    
}