package net.plumbumtroll;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) {

        // Read poetry source from file
        ArrayList<String> source = new ArrayList<>();

        source.add("Синяя волна  ");
        source.add("Ананас;Банана");
        source.add("Мир");
        source.add("Тир");
        source.add("Гиря");
        source.add("Жир");
        source.add("Бездарь");
        source.add("Гарь");
        source.add("фыва ларь");
        source.add("а б вэгэ ");
        source.add("егэ ");

        RhythmBlockBuilder blockBuilder = new RhythmBlockBuilder(new RifmusReader());

        ArrayList<Block> blocks = blockBuilder.buildBlocks(source);

        for (Block block: blocks) {
            for (String s: block.storage) {
                System.out.println(s);
            }

            System.out.println();
        }

        for (int i = 0; i < blocks.size(); i++){
            Block block = blocks.get(i);


        }

        // Write blocks to file
        // ...
    }
}
