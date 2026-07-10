package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;

import java.util.UUID;

/**
 * Fired when a member is removed from a team by UUID. This event is not cancellable.
 */
public class TeamRemoveEvent extends BaseEvent {
    private final ITeam team;
    private final UUID uniqueId;

    /**
     * Creates a new TeamRemoveEvent.
     *
     * @param team the team from which the member is being removed
     * @param uniqueId the UUID of the member being removed
     */
    public TeamRemoveEvent(ITeam team, UUID uniqueId) {
        this.team = team;
        this.uniqueId = uniqueId;
    }

    /**
     * Gets the UUID of the member being removed.
     *
     * @return the unique ID
     */
    public UUID getUniqueId() {
        return uniqueId;
    }

    /**
     * Gets the team from which the member is being removed.
     *
     * @return the team
     */
    public ITeam getTeam() {
        return team;
    }

}
