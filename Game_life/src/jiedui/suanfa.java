package jiedui;
import java.awt.Color;
import javax.swing.JPanel;

public class suanfa {
	static boolean [][] state_one;
    JPanel[][] jPanel;

    public suanfa(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }
    

    public void judge() {
        
        //循环每一个细胞，计数周围细胞个数
        for (int i = 1; i < state_one.length - 1; i++) {
            for (int j = 1; j < state_one[i].length - 1; j++) {
                int count = 0;
                if (jPanel[i-1][j-1].getBackground() == Color.black) {
                    count++;
                }
                if (jPanel[i-1][j].getBackground() == Color.black) {
                    count++;
                }
                if (jPanel[i-1][j+1].getBackground() == Color.black) {
                    count++;
                }
                if (jPanel[i][j - 1].getBackground() == Color.black) {
                    count++;
                }
                if (jPanel[i][j + 1].getBackground() == Color.black) {
                    count++;
                }
                if (jPanel[i + 1][j - 1].getBackground() == Color.black) {
                    count++;
                }
                if (jPanel[i + 1][j].getBackground() == Color.black) {
                    count++;
                }
                if (jPanel[i + 1][j + 1].getBackground() == Color.black) {
                    count++;
                }
                
                
                //状态判断
                if (count==3) {
                    state_one[i][j] = true;
                }
                else if (count == 2) {
                    state_one[i][j] = state_one[i][j];
                }
                else 
                    state_one[i][j] = false;
                
                
        }
    }
    }

}
