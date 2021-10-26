package Task4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class TextWorker {
    private String text;

    public TextWorker(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int wordsCount(){
        String[] words = text.split(" ");

        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i ++){
            set.add(words[i].toLowerCase());
        }

        return set.size();
    }

}
