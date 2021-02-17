package gq.stev.stevesextensions.extension;

import java.util.Collection;
import java.util.function.Predicate;

public interface ExtensionManager {
    Collection<Extension> getLoadedExtensions();
    Extension getExtensionByClass(Class<?> clazz);
    Extension findExtension(Predicate<Extension> predicate);
}