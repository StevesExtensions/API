package gq.stev.stevesextensions.event;

public @interface EventHandler {
    enum Priority {
        LOWEST,
        LOW,
        NORMAL,
        HIGH,
        HIGHEST
    }

    EventHandler.Priority priority() default EventHandler.Priority.NORMAL;
}