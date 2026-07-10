package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

/**
 * Fired when a member is kicked from a team. This event is cancellable; cancelling prevents the kick.
 */
public class TeamKickEvent extends BaseEvent implements Cancellable {

    private final ITeam team;
    private final OfflinePlayer victim;
    private boolean isCancelled;

    /**
     * Creates a new TeamKickEvent.
     *
     * @param team the team from which the player is being kicked
     * @param victim the player being kicked
     */
    public TeamKickEvent(ITeam team, OfflinePlayer victim) {
        this.team = team;
        this.victim = victim;
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
     * Gets the player being kicked from the team.
     *
     * @return the victim being kicked
     */
    public OfflinePlayer getVictim() {
        return victim;
    }

    /**
     * Gets the team from which the player is being kicked.
     *
     * @return the team
     */
    public ITeam getTeam() {
        return team;
    }

}
