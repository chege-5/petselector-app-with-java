import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PetSelectorApp extends JFrame {
   
    private JRadioButton catButton, dogButton, rabbitButton, birdButton, fishButton;
    private JLabel petImageLabel;

    public PetSelectorApp() {
        
        setTitle("Pet Selector");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));


       
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        birdButton = new JRadioButton("Bird");
        fishButton = new JRadioButton("Fish");

        
        ButtonGroup petGroup = new ButtonGroup();
        petGroup.add(catButton);
        petGroup.add(dogButton);
        petGroup.add(rabbitButton);
        petGroup.add(birdButton);
        petGroup.add(fishButton);

        catButton.addActionListener(new PetSelectionListener());
        dogButton.addActionListener(new PetSelectionListener());
        rabbitButton.addActionListener(new PetSelectionListener());
        birdButton.addActionListener(new PetSelectionListener());
        fishButton.addActionListener(new PetSelectionListener());

       
        petImageLabel = new JLabel();
        
      
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(birdButton);
        add(fishButton);
        add(petImageLabel);

        setVisible(true);
    }

    
    private class PetSelectionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
         {
            if (catButton.isSelected())
             {
                ImageIcon catImage = new ImageIcon("pic1.jpg"); 
                petImageLabel.setIcon(catImage);
            } 
            else if (dogButton.isSelected())
             {
                ImageIcon dogImage = new ImageIcon("pic2.jpg");
                petImageLabel.setIcon(dogImage);
            } 
            else if (rabbitButton.isSelected()) 
            {
                ImageIcon rabbitImage = new ImageIcon("pic3.jpg"); 
                petImageLabel.setIcon(rabbitImage);
            } 
            else if (birdButton.isSelected())
             {
                ImageIcon birdImage = new ImageIcon("pic4.jpg"); 
                petImageLabel.setIcon(birdImage);
            } 
            else if (fishButton.isSelected())
             {
                ImageIcon fishImage = new ImageIcon("pic5.jpg");
                petImageLabel.setIcon(fishImage);
            }
        }
    }

    public static void main(String[] args) {
        new PetSelectorApp();
    }
}
