package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

/**
 * Fired when a team's display name changes.
 * <p>
 * This event is cancellable. If cancelled, the name change is prevented.
 * </p>
 */
public class TeamChangeNameEvent extends BaseEvent implements Cancellable {

    private final String oldName;
    private final String newName;
    private final ITeam team;

    private boolean isCancelled;

    /**
     * Creates a new TeamChangeNameEvent.
     *
     * @param team the {@link ITeam} whose display name is changing
     * @param oldName the old team name
     * @param newName the new team name
     */
    public TeamChangeNameEvent(ITeam team, String oldName, String newName) {
        this.team = team;
        this.oldName = oldName;
        this.newName = newName;
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
     * Gets the new team name.
     *
     * @return the new display name
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Gets the old team name.
     *
     * @return the old display name
     */
    public String getOldName() {
        return oldName;
    }

    /**
     * Gets the team whose display name is changing.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

}
