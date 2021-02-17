package gq.stev.stevesextensions.extension;

public interface ExtensionInfo {
    String getId();
    default String getName() {
        return this.getId();
    }
    default String getVersion() {
        return "0";
    }
    default String[] getAuthors() {
        return new String[0];
    }
    default String[] getDependencies() {
        return new String[0];
    }
}