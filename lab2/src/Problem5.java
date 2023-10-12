
public class Problem5 {
    public static void main(String[] args) {
        String text = "A terrorist had a bomb";
        String[] words = new String[2];
        words[0] = "terrorist";
        words[1] = "bomb";

        Problem5 prb5 = new Problem5();
        String result = prb5.censorText(text, words);
        System.out.println("Result: " + result);
    }

    public String censorText(String text, String[] words) {
        boolean isTextSuspect = false;

        for (String word : words) {
            if (text.contains(word)) {
                isTextSuspect = true;
                text = text.replaceAll(word, censorWord(word));
            }
        }

        if (isTextSuspect) {
            System.out.println("Text suspect");
        } else {
            System.out.println("Nothing suspect");
        }

        return text;
    }

    private String censorWord(String word) {
        char[] censored = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            censored[i] = (i == 0 || i == word.length() - 1) ? word.charAt(i) : '*';
        }
        return new String(censored);
    }
}