package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

/**
 * Fired when a member leaves a team. This event is cancellable; cancelling prevents the leave.
 */
public class TeamLeaveEvent extends BaseEvent implements Cancellable {

    private final OfflinePlayer player;
    private final ITeam team;

    private boolean isCancelled;

    /**
     * Creates a new TeamLeaveEvent.
     *
     * @param player the player leaving the team
     * @param team the team being left
     */
    public TeamLeaveEvent(OfflinePlayer player, ITeam team) {
        this.player = player;
        this.team = team;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    /**
     * Gets the player leaving the team.
     *
     * @return the player
     */
    public OfflinePlayer getPlayer() {
        return player;
    }

    /**
     * Gets the team being left.
     *
     * @return the team
     */
    public ITeam getTeam() {
        return team;
    }

}
