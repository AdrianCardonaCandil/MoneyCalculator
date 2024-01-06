package software.ulpgc.view.swing;
import javax.swing.*;

public class ImagePanel extends JPanel {

    JLabel imageLabel;

    public ImagePanel() {
        ImageIcon image = new ImageIcon("exchange-rate.jpeg");
        imageLabel = new JLabel(image);
        this.add(imageLabel);
    }
}
