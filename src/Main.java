import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

class uma {

    static void frameMethod(JFrame frame) {
        BorderLayout border = new BorderLayout();
        frame.setSize(500, 600);
        frame.setLayout(border);
        frame.setVisible(true);
    }

    static void frameAddMethod(JFrame frame, JButton umabutton, JButton closeButton) {
        frame.add(umabutton, BorderLayout.CENTER);
        frame.add(closeButton, BorderLayout.NORTH);
    }

    static int randomNumber() {
        int randomNum = (int) (Math.random() * 5);
        System.out.println(randomNum);
        return randomNum;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frameMethod(frame);
        JButton umabutton = new JButton("Click here for FREE umamusume");
        JButton closeButton = new JButton("Click here to close the program");
        frameAddMethod(frame, umabutton, closeButton);
        umabutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int arrayNumber = 0;
                    arrayNumber = randomNumber();
                    String[] imageLinks = new String[] {"C:\\Users\\Walee\\Downloads\\Oguri.jpg",
                            "C:\\Users\\Walee\\Downloads\\l2hzfgekhr6g1.jpg",
                            "C:\\Users\\Walee\\Downloads\\l1k60ofljx9f1.jpeg",
                            "C:\\Users\\Walee\\Downloads\\maxresdefault.jpg",
                            "C:\\Users\\Walee\\Downloads\\y51nn7py7jff1.jpeg"};
                    File oguriImage = new File(imageLinks[arrayNumber]);
                    BufferedImage bufferedOguri = ImageIO.read(oguriImage);
                    ImageIcon oguriIcon = new ImageIcon(bufferedOguri);
                    JFrame finaljFrame = new JFrame();
                    finaljFrame.setLayout(new FlowLayout());
                    finaljFrame.setSize(500, 500);
                    JLabel jLabel = new JLabel();
                    jLabel.setIcon(oguriIcon);
                    finaljFrame.add(jLabel);
                    finaljFrame.setVisible(true);
                    finaljFrame.setDefaultCloseOperation(finaljFrame.EXIT_ON_CLOSE);
                } catch (IOException ioe) {
                    System.out.println("looks like we have trouble reading ts file: " + ioe.getMessage());
                }



            }
        });
    }
}

