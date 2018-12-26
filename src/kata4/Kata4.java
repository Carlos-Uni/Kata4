package kata4;

import java.io.IOException;
import view.MailListReader;
import model.Mail;
import view.MailHistogramBuilder;
import model.Histogram;
import java.util.List;
import view.HistogramDisplay;

public class Kata4 {
    public static void main(String[] args) throws IOException {
        MailListReader a = new MailListReader();
        List<Mail> listMails = a.read("C:\\Users\\charl\\Documents\\NetBeansProjects\\Kata4\\emails.txt");
        MailHistogramBuilder b = new MailHistogramBuilder();
        Histogram c = b.build(listMails);
        new HistogramDisplay(c).execute();
    }

}
