package gq.stev.stevesextensions.text;

public class StringTextComponent extends TextComponent {
    private final String text;

    public StringTextComponent(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}