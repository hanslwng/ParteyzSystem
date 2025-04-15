import javax.swing.*;

public class Send_Email {
    private JTextArea area;

    public static void main(String[] args) {
        Send_Email sendEmail = new Send_Email();
        sendEmail.sendEmail();
    }

    public void sendEmail() {
        Email email = new Email();

        String to = "hansjacobliwanag19@gmail.com";
        String from = "hansliwanag2@gmail.com";
        String subject = "PARTEYZ CATERING SYSTEM RECEIPT!";
        String text = area.getText(); 

        int k = email.send(to, from, subject, text);
        // Checking if email sent or not
        if (k == 0) {
            System.out.print("Error");
        } else {
            System.out.println("Success");
        }
    }

    public void setTextArea(JTextArea area) {
        this.area = area;
    }
}

