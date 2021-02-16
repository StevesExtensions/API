package gq.stev.stevesextensions.extension;

public abstract class Extension {
    public interface Info {
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

    public abstract Extension.Info getInformation();

    public abstract void onLoad();
}