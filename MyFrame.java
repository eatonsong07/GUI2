import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame implements ActionListener {
    private JButton play;
    private boolean ifNext;
    private JPanel first;
    private JLabel secondLabel;
    private JPanel second;
    private JPanel next;
    MyFrame(){


        //start button
        ImageIcon start=new ImageIcon("src/start.png"); //start button
        ImageIcon firstImage=new ImageIcon("src/first.png"); //first panel image
        ImageIcon secondImage=new ImageIcon("src/instructions.png"); //second panel image background
        ImageIcon nextImage=new ImageIcon("src/next.png"); //second next image

        Image image = firstImage.getImage(); // transform it
        Image newing = image.getScaledInstance(1920, 1080,  java.awt.Image.SCALE_SMOOTH);
        firstImage =new ImageIcon(newing);

        Image image1 = firstImage.getImage(); // transform it
        Image newing1 = image1.getScaledInstance(1920, 1080,  java.awt.Image.SCALE_SMOOTH);
        secondImage =new ImageIcon(newing1);



        JButton play=new JButton();
        play.setBounds(525,670, 920,363);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == play) {
                    System.out.println("Hey");
                    play.setEnabled(false);
                    ifNext=true;

                    //button.setEnabled("false); makes it so the button could only be used once
                    //label.setVisible(true); could make a label appear true;
                }
            }

        } );
        play.setFocusable(false);
        play.setIcon(start);
        play.setBorder(BorderFactory.createEtchedBorder());
        play.setVisible(true);


        //first jlabel for background of first jpanel
        JLabel firstLabel=new JLabel();
        firstLabel.setIcon(firstImage);
        firstLabel.setBounds(0,0,1920,1080);
        firstLabel.setVisible(true);
        firstLabel.setLayout(null);
        firstLabel.add(play);




        //next jbutton
        JButton next=new JButton();
        next.setBounds(1800,900, 300,300);
        next.addActionListener(this);

        //second jlabel for second jpanel
        JLabel secondLabel=new JLabel();
        secondLabel.setIcon(secondImage);
        secondLabel.setBounds(0,0,1920,1080);
        secondLabel.setLayout(null);
        secondLabel.add(next);



        //first jpanel
        JPanel first=new JPanel();
        first.setBounds(0,0,1920,1080); //sets the size
        first.setVisible(true);
        first.add(firstLabel);


        //second Jpanel
        JPanel second = new JPanel();
        second.setBounds(0,0,1920,1080);
        second.add(secondLabel); //use the label as a background
        second.setVisible(true);



        this.add(first);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1920,1080);
        this.setVisible(true);
        this.show();


    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            System.out.println("Hey");

            ifNext=true;


            //makes it so the button could only be used once
            //label.setVisible(true); could make a label appear true;
            ifNext=true;
            first.setVisible(false);
            this.remove(first);
            this.add(second);
            play.setEnabled(false);
        }
        else {
            if(e.getSource()==next){
                this.setVisible(false);
            }

        }
    }

    }

