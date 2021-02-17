package gq.stev.stevesextensions.server;

import gq.stev.stevesextensions.event.EventManager;
import gq.stev.stevesextensions.extension.ExtensionManager;

public abstract class Server {
    private static Server instance = null;

    public static Server getInstance() {
        return Server.instance;
    }

    public static void setInstance(Server instance) {
        if(Server.instance != null) {
            throw new UnsupportedOperationException("The server instance is already set");
        }
        Server.instance = instance;
    }

    public abstract String getImplementationName();
    public abstract String getImplementationVersion();
    public abstract String getMinecraftVersion();

    public abstract LoadingStage getLoadingStage();

    public abstract EventManager getEventManager();
    public abstract ExtensionManager getExtensionManager();
}