package Counter2Package;
import java.util.Scanner;
public class Counter {
    private final int line;
    private final int character;
    private final String text;

    public Counter(int myLine, int myCharacter, String myText) {
        line = myLine;
        character = myCharacter;
        text = myText;
    }

    public int getLine() {
        return line;
    }

    public int getCharacter() {
        return character;
    }

    public String getText() {
        return text;
    }
}
