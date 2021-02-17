package gq.stev.stevesextensions.registry;

public interface Registry<T> {
    Class<T> getType();
    void register(T... objects);
}