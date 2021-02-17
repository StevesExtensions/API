package gq.stev.stevesextensions.event;

public interface Preventable {
    boolean isPrevented();
    void prevent();
}