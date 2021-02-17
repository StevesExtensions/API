package gq.stev.stevesextensions.event;

import gq.stev.stevesextensions.event.handler.EventListener;
import gq.stev.stevesextensions.event.handler.EventHandlerPriority;
import gq.stev.stevesextensions.extension.Extension;
import gq.stev.stevesextensions.util.Pair;

import java.util.Collection;
import java.util.function.Consumer;

public interface EventManager {
    <T> void addHandler(Extension extension, Class<T> eventClass, EventHandlerPriority priority, Consumer<T> listener);
    void addListener(Extension extension, EventListener listener);
    Collection<Pair<Extension, Throwable>> fireEvent(Event event);
}