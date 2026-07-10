package gg.lode.leadapi.api;

/**
 * Enumeration of strategies for auto-generating team identifiers and names.
 */
public enum GeneratorType {
    /**
     * Generates team identifiers using numeric values.
     */
    NUMBER,

    /**
     * Generates team identifiers using player names or name-based values.
     */
    NAME,

    /**
     * Generates team identifiers using hexadecimal color codes.
     */
    COLOR,

    /**
     * Generates team identifiers using Unicode characters.
     */
    UNICODE
}
