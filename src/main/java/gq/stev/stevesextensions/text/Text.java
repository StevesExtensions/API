package gq.stev.stevesextensions.text;

public class Text {
    private final TextComponent[] components;

    public Text(TextComponent... components) {
        this.components = components;
    }

    public TextComponent[] getComponents() {
        return this.components;
    }
}