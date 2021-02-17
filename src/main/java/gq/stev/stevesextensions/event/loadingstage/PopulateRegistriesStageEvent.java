package gq.stev.stevesextensions.event.loadingstage;

import gq.stev.stevesextensions.registry.Registry;
import gq.stev.stevesextensions.server.LoadingStage;

public class PopulateRegistriesStageEvent extends LoadingStageEvent {
    public <T> Registry<T> getRegistry(Class<T> type) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LoadingStage getStage() {
        return LoadingStage.POPULATE_REGISTRIES;
    }
}