package to.lodestone.leadapi.api.exception;

public class MaxTeamLimitException extends Exception {

    public MaxTeamLimitException() {
        super("You have reached the maximum team limit!");
    }

    public MaxTeamLimitException(String message) {
        super(message);
    }
}
