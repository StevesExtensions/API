package gq.stev.stevesextensions.event.loadingstage;

import gq.stev.stevesextensions.entity.CommandSender;
import gq.stev.stevesextensions.registry.Registry;
import gq.stev.stevesextensions.server.LoadingStage;
import gq.stev.stevesextensions.text.StringTextComponent;
import gq.stev.stevesextensions.text.Text;

public class PopulateRegistriesStageEvent extends LoadingStageEvent {
    public <T> Registry<T> getRegistry(Class<T> type) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LoadingStage getStage() {
        return LoadingStage.POPULATE_REGISTRIES;
    }
}