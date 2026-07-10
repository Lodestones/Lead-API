package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Fired when a player sends a message in team chat. This event is cancellable; cancelling prevents the message from being sent.
 * The message content can be modified via {@link #setMessage(String)}.
 */
public class TeamMessageEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private String message;
    private boolean isCancelled;

    /**
     * Creates a new TeamMessageEvent.
     *
     * @param player the player sending the message
     * @param message the message content
     */
    public TeamMessageEvent(Player player, String message) {
        this.player = player;
        this.message = message;
    }

    /**
     * Gets the player who sent the message.
     *
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Gets the message content.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message content. This allows modification of the message before it is sent.
     *
     * @param message the new message content
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
