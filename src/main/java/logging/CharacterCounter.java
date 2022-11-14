package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharacterCounter {

    public static final Logger LOGGER = LoggerFactory.getLogger(CharacterCounter.class);

    public int countCharacters(String source) {
        LOGGER.info(String.format("countCharacters: %s", source));
        int counter = 0;
        int length = source.length();
        for (int i = 0; i < length; i++) {
            if (source.charAt(i) == 'b') {
                LOGGER.info(String.format("b: %d", i));
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new CharacterCounter().countCharacters("abababac"));
    }
}
