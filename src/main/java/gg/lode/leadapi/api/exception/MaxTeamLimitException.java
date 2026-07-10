package gg.lode.leadapi.api.exception;

/**
 * Thrown when a player has reached the maximum number of teams they may create.
 */
public class MaxTeamLimitException extends Exception {

    /**
     * Creates a new MaxTeamLimitException with the default message.
     */
    public MaxTeamLimitException() {
        super("You have reached the maximum team limit!");
    }

    /**
     * Creates a new MaxTeamLimitException with a custom message.
     *
     * @param message the exception message
     */
    public MaxTeamLimitException(String message) {
        super(message);
    }
}
