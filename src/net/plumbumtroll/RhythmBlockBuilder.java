package net.plumbumtroll;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class RhythmBlockBuilder {

    private HtmlReader reader;

    public RhythmBlockBuilder(HtmlReader reader) {
        this.reader = reader;
    }

    // Вычленяет из строки рифмуемое слово
    public String stringCleaner(String inputString) {
        // TODO: доделать метод для определения более общих строк

        String[] words = inputString.split(" ");
        return words[words.length - 1];
    }

    private boolean isRhyme(String s1, String s2) {
        // TODO: реализовать обращение к сайту
        return (s1.substring(s1.length() - 2).equals(s2.substring(s2.length() - 2)));

        //return false;
    }

    public ArrayList<Block> buildBlocks(ArrayList<String> poetrySource, ) {

        ArrayList<String> poetrySourceTemp = new ArrayList<>(poetrySource);
        ArrayList<Block> blocks = new ArrayList<>();

        for (int i = 0; i < poetrySourceTemp.size(); i++) {

            Block currentBlock = new Block(poetrySourceTemp.get(i));

            String rhymedWord = stringCleaner(poetrySourceTemp.get(i));

            for (int j = i + 1; j < poetrySourceTemp.size(); j++) {
                // Проверяем, рифмуются ли строки
                if (isRhyme(rhymedWord, stringCleaner(poetrySourceTemp.get(j)))) {
                    currentBlock.storage.add(poetrySourceTemp.get(j));
                    poetrySourceTemp.remove(j);
                }
            }

            if (currentBlock.storage.size() > 1)
            {
                blocks.add(currentBlock);
            }
        }

        return blocks;
    }
}
