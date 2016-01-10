
package kata4_3;

import java.util.ArrayList;

public class Kata4_3 {

    public static void main(String[] args) {
 
        String nameFile = "emails.txt";
        
        
        MailReader mailReader = new MailReader(nameFile);
        ArrayList <String> mailarray = mailReader.getArrayList();
        Histogram<String> histo = MailHistogramBuilder.build(mailarray);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histo);
        histogramDisplay.execute();
    }
    
}
