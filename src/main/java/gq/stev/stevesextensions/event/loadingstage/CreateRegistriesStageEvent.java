package gq.stev.stevesextensions.event.loadingstage;

import gq.stev.stevesextensions.extension.Extension;
import gq.stev.stevesextensions.server.LoadingStage;

public class CreateRegistriesStageEvent extends LoadingStageEvent {
    public void addRegistry(Extension source, Class<?>... registries) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LoadingStage getStage() {
        return LoadingStage.CREATE_REGISTRIES;
    }
}