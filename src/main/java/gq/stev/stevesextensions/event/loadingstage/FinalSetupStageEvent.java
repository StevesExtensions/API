package gq.stev.stevesextensions.event.loadingstage;

import gq.stev.stevesextensions.server.LoadingStage;

public class FinalSetupStageEvent extends LoadingStageEvent {
    @Override
    public LoadingStage getStage() {
        return LoadingStage.FINAL_SETUP;
    }
}