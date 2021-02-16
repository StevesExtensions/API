package gq.stev.stevesextensions.event;

import gq.stev.stevesextensions.extension.Extension;

public interface EventManager {
    void addListener(Extension extension, EventListener listener);
}