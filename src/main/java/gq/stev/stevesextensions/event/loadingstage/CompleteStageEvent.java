package gq.stev.stevesextensions.event.loadingstage;

import gq.stev.stevesextensions.server.LoadingStage;

public class CompleteStageEvent extends LoadingStageEvent {
    @Override
    public LoadingStage getStage() {
        return LoadingStage.COMPLETE;
    }
}