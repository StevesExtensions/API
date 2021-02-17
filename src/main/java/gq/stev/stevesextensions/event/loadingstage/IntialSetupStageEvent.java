package gq.stev.stevesextensions.event.loadingstage;

import gq.stev.stevesextensions.server.LoadingStage;

public class IntialSetupStageEvent extends LoadingStageEvent {
    @Override
    public LoadingStage getStage() {
        return LoadingStage.INITIAL_SETUP;
    }
}