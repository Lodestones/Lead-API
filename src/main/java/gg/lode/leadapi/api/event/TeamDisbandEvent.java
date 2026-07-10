package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

/**
 * Fired when a team is disbanded.
 * <p>
 * This event is cancellable. If cancelled, the disbanding is prevented.
 * </p>
 */
public class TeamDisbandEvent extends BaseEvent implements Cancellable {

    public ITeam team;

    private boolean isCancelled;

    /**
     * Creates a new TeamDisbandEvent.
     *
     * @param team the {@link ITeam} being disbanded
     */
    public TeamDisbandEvent(ITeam team) {
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
     * Gets the team being disbanded.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

}
