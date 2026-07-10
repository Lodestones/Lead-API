package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;

/**
 * Fired when a team is deleted.
 * <p>
 * This event is not cancellable.
 * </p>
 */
public class TeamDeleteEvent extends BaseEvent {

    public ITeam team;

    /**
     * Creates a new TeamDeleteEvent.
     *
     * @param team the {@link ITeam} being deleted
     */
    public TeamDeleteEvent(ITeam team) {
        this.team = team;
    }

    /**
     * Gets the team being deleted.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

}
