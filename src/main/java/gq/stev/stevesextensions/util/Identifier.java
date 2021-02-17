package gq.stev.stevesextensions.util;

import java.util.Objects;

public class Identifier {
    private final String namespace;
    private final String key;

    public Identifier(String namespace, String key) {
        this.namespace = namespace;
        this.key = key;
    }

    @Override
    public String toString() {
        return this.namespace + ":" + this.key;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Identifier that = (Identifier) object;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.namespace, this.key);
    }
}