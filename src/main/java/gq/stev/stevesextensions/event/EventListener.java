package gq.stev.stevesextensions.event;

import java.util.ArrayList;
import java.util.List;

public abstract class EventListener {
    @FunctionalInterface
    public interface Listener<T extends Event> {
        void onEvent(T event);
    }

    public static class ListenerPair<T extends Event> {
        private final Class<T> eventClass;
        private final Listener<T> listener;

        public ListenerPair(Class<T> eventClass, EventListener.Listener<T> listener) {
            this.eventClass = eventClass;
            this.listener = listener;
        }

        public Class<T> getEventClass() {
            return this.eventClass;
        }

        public Listener<T> getListener() {
            return this.listener;
        }
    }

    private final List<ListenerPair<? extends Event>> listeners = new ArrayList<>();

    protected final <T extends Event> void addListener(Class<T> eventClass, EventListener.Listener<T> listener) {
        this.listeners.add(new ListenerPair<>(eventClass, listener));
    }

    public List<EventListener.ListenerPair<? extends Event>> getListeners() {
        return this.listeners;
    }
}