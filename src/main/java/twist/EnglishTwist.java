package twist;

import java.util.ArrayList;
import java.util.List;

public class EnglishTwist {


    public List<String> play(List<String> items) {

        List<String> result = new ArrayList<>();
        if (!isInputValid(items)) {
            return result;
        }

        String previous = items.get(0);
        result.add(previous);

        for (int i = 1; i < items.size(); i++) {
            String currentWord = items.get(i);

            if (currentWord.isEmpty()) {
                break;
            }
            char lastChar = previous.charAt(previous.length() - 1);
            char firstChar = currentWord.charAt(0);

            if (lastChar == firstChar) {
                result.add(currentWord);
            } else {
                break;
            }

            previous = currentWord;
        }

        return result;
    }

    private boolean isInputValid(List<String> items) {
        return !(items.isEmpty() || items.get(0).isEmpty());
    }

}
