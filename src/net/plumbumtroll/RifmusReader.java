package net.plumbumtroll;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class RifmusReader implements HtmlReader {

    @Override
    public ArrayList<String> GetRhythmWords(String s) {

        Document doc = null;
        try {
            doc = Jsoup.connect("https://rifmus.net/rifma/%D0%B7%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5").get();
        } catch (IOException e) {
            e.printStackTrace();
        }



        Elements ulElements = doc.getElementsByTag("ul");
    }
}
