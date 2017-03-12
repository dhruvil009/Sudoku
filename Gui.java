import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Admin on 23-02-2017.
 */
public class Gui extends Frame implements ActionListener {
    private final Button b01;
    private final Button b02;
    private final Button b03;
    private final Button b04;
    private final Button b05;
    private final Button b06;
    private final Button b07;
    private final Button b08;
    private final Button b09;
    private final Button b10;
    private final Button b11;
    private final Button b12;
    private final Button b13;
    private final Button b14;
    private final Button b15;
    private final Button b16;
    private final Button b17;
    private final Button b18;
    private final Button b19;
    private final Button b20;
    private final Button b21;
    private final Button b22;
    private final Button b23;
    private final Button b24;
    private final Button b25;
    private final Button b26;
    private final ImageIcon a;

    Gui()
    {
        b01 = new Button(" ");
        b01.setBounds(30, 100, 10, 10);// setting button position
        b01.addActionListener(this);
        b02 = new Button(" ");
        b02.setBounds(80, 100, 10, 10);// setting button position
        b02.addActionListener(this);
        b03 = new Button(" ");
        b03.setBounds(130, 100, 10, 10);// setting button position
        b03.addActionListener(this);
        b04 = new Button(" ");
        b04.setBounds(180, 100, 10, 10);// setting button position
        b04.addActionListener(this);
        b05 = new Button(" ");
        b05.setBounds(230, 100, 10, 10);// setting button position
        b05.addActionListener(this);
        b06 = new Button(" ");
        b06.setBounds(280, 100, 10, 10);// setting button position
        b06.addActionListener(this);
        b07 = new Button(" ");
        b07.setBounds(30, 150, 10, 10);// setting button position
        b07.addActionListener(this);
        b08 = new Button(" ");
        b08.setBounds(80, 150, 10, 10);// setting button position
        b08.addActionListener(this);
        b09 = new Button(" ");
        b09.setBounds(130, 150, 10, 10);// setting button position
        b09.addActionListener(this);
        b10 = new Button(" ");
        b10.setBounds(180, 150, 10, 10);// setting button position
        b10.addActionListener(this);
        b11 = new Button("11");
        b11.setBounds(230, 150, 10, 10);// setting button position
        b11.addActionListener(this);
        b12 = new Button("12");
        b12.setBounds(280, 150, 10, 10);// setting button position
        b12.addActionListener(this);
        b13 = new Button("13");
        b13.setBounds(30, 200, 10, 10);// setting button position
        b13.addActionListener(this);
        b14 = new Button("14");
        b14.setBounds(80, 200, 10, 10);// setting button position
        b14.addActionListener(this);
        b15 = new Button("15");
        b15.setBounds(130, 200, 10, 10);// setting button position
        b15.addActionListener(this);
        b16 = new Button("16");
        b16.setBounds(180, 200, 10, 10);// setting button position
        b16.addActionListener(this);
        b17 = new Button("17");
        b17.setBounds(230, 200, 10, 10);// setting button position
        b17.addActionListener(this);
        b18 = new Button("18");
        b18.setBounds(280, 200, 10, 10);// setting button position
        b18.addActionListener(this);
        b19 = new Button("19");
        b19.setBounds(30, 250, 10, 10);// setting button position
        b19.addActionListener(this);
        b20 = new Button("20");
        b20.setBounds(80, 250, 10, 10);// setting button position
        b20.addActionListener(this);
        b21 = new Button("21");
        b21.setBounds(130, 250, 10, 10);// setting button position
        b21.addActionListener(this);
        b22 = new Button("22");
        b22.setBounds(180, 250, 10, 10);// setting button position
        b22.addActionListener(this);
        b23 = new Button("23");
        b23.setBounds(230, 250, 10, 10);// setting button position
        b23.addActionListener(this);
        b24 = new Button("24");
        b24.setBounds(280, 250, 10, 10);// setting button position
        b24.addActionListener(this);
        b25 = new Button("25");
        b25.setBounds(130, 300, 10, 10);// setting button position
        b25.addActionListener(this);
        b26 = new Button("26");
        b26.setBounds(180, 300, 10, 10);// setting button position
        b26.addActionListener(this);

        a = new ImageIcon("myImage.jpeg");

        b01.setBackground(Color.CYAN);
        b02.setBackground(Color.CYAN);
        b03.setBackground(Color.CYAN);
        b04.setBackground(Color.CYAN);
        b05.setBackground(Color.CYAN);
        b06.setBackground(Color.CYAN);
        b07.setBackground(Color.CYAN);
        b08.setBackground(Color.CYAN);
        b09.setBackground(Color.CYAN);
        b10.setBackground(Color.CYAN);
        b11.setBackground(Color.CYAN);
        b12.setBackground(Color.CYAN);
        b13.setBackground(Color.CYAN);
        b14.setBackground(Color.CYAN);
        b15.setBackground(Color.CYAN);
        b16.setBackground(Color.CYAN);
        b17.setBackground(Color.CYAN);
        b18.setBackground(Color.CYAN);
        b19.setBackground(Color.CYAN);
        b20.setBackground(Color.CYAN);
        b21.setBackground(Color.CYAN);
        b22.setBackground(Color.CYAN);
        b23.setBackground(Color.CYAN);
        b24.setBackground(Color.CYAN);
        b25.setBackground(Color.CYAN);
        b26.setBackground(Color.CYAN);

        //singleBoard = new Board();

        //add(singleBoard, BorderLayout.LINE_END);
        //singleBoard.setColor();


        add(b01);//adding button into frame
        add(b02);//adding button into frame
        add(b03);//adding button into frame
        add(b04);//adding button into frame
        add(b05);//adding button into frame
        add(b06);//adding button into frame
        add(b07);//adding button into frame
        add(b08);//adding button into frame
        add(b09);//adding button into frame
        add(b10);//adding button into frame
        add(b11);//adding button into frame
        add(b12);//adding button into frame
        add(b13);//adding button into frame
        add(b14);//adding button into frame
        add(b15);//adding button into frame
        add(b16);//adding button into frame
        add(b17);//adding button into frame
        add(b18);//adding button into frame
        add(b19);//adding button into frame
        add(b20);//adding button into frame
        add(b21);//adding button into frame
        add(b22);//adding button into frame
        add(b23);//adding button into frame
        add(b24);//adding button into frame
        add(b25);//adding button into frame
        add(b26);//adding button into frame
        this.setBackground(Color.PINK);
        setSize(120, 160);//frame size 300 width and 300 height
        setLayout(new GridLayout(9,9));//no layout manager
        setVisible(true);//now frame will be visible, by default not visible

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String args[])
    {
        Gui g= new Gui();
    }
}
