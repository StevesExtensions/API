package gq.stev.stevesextensions.server;

public enum LoadingStage {
    /**
     * The stage when the extensions are being loaded
     */
    LOAD_EXTENSIONS,

    /**
     * The stage when all extensions are loaded
     */
    INITIAL_SETUP,

    /**
     * The stage when registries are being created
     */
    CREATE_REGISTRIES,

    /**
     * The stage when registries are being populated
     */
    POPULATE_REGISTRIES,

    /**
     * The stage before the world is loaded
     */
    FINAL_SETUP,

    /**
     * The stage after the world is loaded
     */
    COMPLETE
}