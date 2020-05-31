package jiedui;
import java.awt.Color;
import javax.swing.JPanel;

public class show {
	static boolean [][] state_one;
    static JPanel[][] jPanel;

    public show(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }

    public static void paint()
    {
            //初始化生死
        for(int i=1;i<state_one.length;i++)
        {
            for(int j=1;j<state_one[i].length-1;j++)
            {
                if (state_one[i][j]) {
                jPanel[i][j].setBackground(Color.black);
                }
                else{
                    jPanel[i][j].setBackground(Color.white);
                }
            }
        }
    }

}
