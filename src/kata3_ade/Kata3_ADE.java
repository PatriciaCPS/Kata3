
package kata3_ade;

public class Kata3_ADE {

    public static void main(String[] args) {
        Histogram histogram = new Histogram<String>();
        histogram.increment("gmail.com");
        histogram.increment("hotmail.es");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("outlook.com");
        histogram.increment("instagram.com");
        histogram.increment("hotmail.es");
        histogram.increment("ulpgc.com");
        histogram.increment("instagram.com");
        histogram.increment("outlook.es");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
