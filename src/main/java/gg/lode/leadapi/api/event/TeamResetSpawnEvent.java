package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

/**
 * Fired when a team's spawn location is reset. This event is cancellable; cancelling prevents the reset.
 */
public class TeamResetSpawnEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final ITeam team;

    /**
     * Creates a new TeamResetSpawnEvent.
     *
     * @param team the team whose spawn is being reset
     */
    public TeamResetSpawnEvent(ITeam team) {
        this.team = team;
    }

    /**
     * Gets the team whose spawn is being reset.
     *
     * @return the team
     */
    public ITeam getTeam() {
        return team;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }
}
