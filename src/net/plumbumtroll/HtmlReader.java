package net.plumbumtroll;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public interface HtmlReader {

    public ArrayList<String> GetRhythmWords(String s);
}
