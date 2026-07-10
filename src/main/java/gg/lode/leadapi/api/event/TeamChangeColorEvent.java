package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

/**
 * Fired when a team's color changes.
 * <p>
 * This event is cancellable. If cancelled, the color change is prevented.
 * </p>
 */
public class TeamChangeColorEvent extends BaseEvent implements Cancellable {

    private final String oldColor;
    private final String newColor;
    private final ITeam team;

    private boolean isCancelled;

    /**
     * Creates a new TeamChangeColorEvent.
     *
     * @param team the {@link ITeam} whose color is changing
     * @param oldColor the old color as a hex string
     * @param newColor the new color as a hex string
     */
    public TeamChangeColorEvent(ITeam team, String oldColor, String newColor) {
        this.team = team;
        this.oldColor = oldColor;
        this.newColor = newColor;
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
     * Gets the new color.
     *
     * @return the new color as a hex string
     */
    public String getNewColor() {
        return newColor;
    }

    /**
     * Gets the old color.
     *
     * @return the old color as a hex string
     */
    public String getOldColor() {
        return oldColor;
    }

    /**
     * Gets the team whose color is changing.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

}
