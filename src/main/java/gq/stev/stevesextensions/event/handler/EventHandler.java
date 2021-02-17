package gq.stev.stevesextensions.event.handler;

import gq.stev.stevesextensions.event.Event;

import java.util.function.Consumer;

public class EventHandler<T extends Event> {
    private final Class<T> eventClass;
    private final EventHandlerPriority priority;
    private final Consumer<T> listener;

    public EventHandler(Class<T> eventClass, EventHandlerPriority priority, Consumer<T> listener) {
        this.eventClass = eventClass;
        this.priority = priority;
        this.listener = listener;
    }

    public Class<T> getEventClass() {
        return this.eventClass;
    }

    public EventHandlerPriority getPriority() {
        return this.priority;
    }

    public Consumer<T> getListener() {
        return this.listener;
    }
}