package gq.stev.stevesextensions.event.handler;

import gq.stev.stevesextensions.event.Event;
import gq.stev.stevesextensions.event.loadingstage.PopulateRegistriesStageEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public abstract class EventListener {
    private final List<EventHandler<? extends Event>> listeners = new ArrayList<>();

    protected final <T extends Event> void addListener(Class<T> eventClass, EventHandlerPriority priority, Consumer<T> listener) {
        this.listeners.add(new EventHandler<>(eventClass, priority, listener));
    }

    protected final <T extends Event> void addListener(Class<T> eventClass, Consumer<T> listener) {
        this.listeners.add(new EventHandler<>(eventClass, EventHandlerPriority.NORMAL, listener));
    }

    public List<EventHandler<? extends Event>> getListeners() {
        return this.listeners;
    }
}