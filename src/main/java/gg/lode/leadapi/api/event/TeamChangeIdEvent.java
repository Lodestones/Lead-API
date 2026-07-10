package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

/**
 * Fired when a team's ID changes.
 * <p>
 * This event is cancellable. If cancelled, the ID change is prevented.
 * </p>
 */
public class TeamChangeIdEvent extends BaseEvent implements Cancellable {

    private final String oldId;
    private final String newId;
    private final ITeam team;


    private boolean isCancelled;

    /**
     * Creates a new TeamChangeIdEvent.
     *
     * @param team the {@link ITeam} whose ID is changing
     * @param oldId the old team ID
     * @param newId the new team ID
     */
    public TeamChangeIdEvent(ITeam team, String oldId, String newId) {
        this.team = team;
        this.oldId = oldId;
        this.newId = newId;
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
     * Gets the new team ID.
     *
     * @return the new ID
     */
    public String getNewId() {
        return newId;
    }

    /**
     * Gets the old team ID.
     *
     * @return the old ID
     */
    public String getOldId() {
        return oldId;
    }

    /**
     * Gets the team whose ID is changing.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

}
