package gq.stev.stevesextensions.event.registry;

import gq.stev.stevesextensions.event.Event;
import gq.stev.stevesextensions.registry.Registry;

public class RegistryEvent extends Event {
    public RegistryEvent() {

    }

    public <T> Registry<T> getRegistry(Class<T> clazz) {
        return null;
    }
}