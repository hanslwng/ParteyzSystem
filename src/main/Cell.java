package main;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Cell extends JButton {

    private String dateFormat;

    private Date date;
    private boolean title;
    private boolean isToDay;

    public Cell() {
        setContentAreaFilled(true);
        setBorder(new LineBorder(Color.BLACK));
        setHorizontalAlignment(JLabel.CENTER);
        setFont(getFont().deriveFont(Font.BOLD)); // Set the font to bold
        
    }

    public void asTitle() {
        title = true;
    }

    public void setDateFormat(String format) {
        this.dateFormat = format;
    }

    public void setDate(Date date) {
        this.date = date;
        if (dateFormat != null) {
            setText(new SimpleDateFormat(dateFormat).format(date));
        }
    }

    public boolean isTitle() {
        return title;
    }

    public void currentMonth(boolean act) {
        if (act) {
            setForeground(new Color(68, 68, 68));
        } else {
            setForeground(new Color(169, 169, 169));
        }
    }

    public void setAsToDay() {
        isToDay = true;
        setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);

        if (title) {
            drawTitleLine(grphcs);
        }
        if (isToDay) {
            drawTodayIndicator(grphcs);
        }
    }

    private void drawTitleLine(Graphics grphcs) {
        grphcs.setColor(new Color(213, 213, 213));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }

    private void drawTodayIndicator(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the color of the text to white so that it's visible on the button
        g2.setColor(new Color(213, 213, 213));

        super.paintComponent(g2); // Ensure that the text is painted

        // Now draw the rounded rectangle
        g2.setColor(new Color(97, 49, 237));

        int rectWidth = 35;
        int rectHeight = 35;
        int arcWidth = 100; // Adjust the corner arc width as needed
        int arcHeight = 100; // Adjust the corner arc height as needed

        // Calculate the center coordinates for the rectangle
        int centerX = (getWidth() - rectWidth) / 2;
        int centerY = (getHeight() - rectHeight) / 2;

        g2.fillRoundRect(centerX, centerY, rectWidth, rectHeight, arcWidth, arcHeight);
    }
}
