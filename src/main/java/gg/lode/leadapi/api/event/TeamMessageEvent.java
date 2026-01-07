package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class TeamMessageEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private String message;
    private boolean isCancelled;

    public TeamMessageEvent(Player player, String message) {
        this.player = player;
        this.message = message;
    }

    public Player getPlayer() {
        return player;
    }

    public String getMessage() {
        return message;
    }

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
