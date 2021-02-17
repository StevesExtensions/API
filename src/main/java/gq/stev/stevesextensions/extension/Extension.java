package gq.stev.stevesextensions.extension;

import com.google.gson.JsonObject;

public abstract class Extension {
    public abstract ExtensionInfo getInformation();

    public abstract void onLoad();
}