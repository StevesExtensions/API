package gq.stev.stevesextensions.event.loadingstage;

import gq.stev.stevesextensions.event.Event;
import gq.stev.stevesextensions.server.LoadingStage;

public abstract class LoadingStageEvent extends Event {
    public abstract LoadingStage getStage();
}