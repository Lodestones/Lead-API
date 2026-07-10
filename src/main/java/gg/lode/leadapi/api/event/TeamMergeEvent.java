package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

/**
 * Fired when two teams merge into one. This event is cancellable; cancelling prevents the merge.
 */
public class TeamMergeEvent extends BaseEvent implements Cancellable {

    private final ITeam teamOne;
    private final ITeam teamTwo;

    private boolean isCancelled;

    /**
     * Creates a new TeamMergeEvent.
     *
     * @param teamOne the first team being merged
     * @param teamTwo the second team being merged
     */
    public TeamMergeEvent(ITeam teamOne, ITeam teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
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
     * Gets the first team being merged.
     *
     * @return the first team
     */
    public ITeam getTeamOne() {
        return teamOne;
    }

    /**
     * Gets the second team being merged.
     *
     * @return the second team
     */
    public ITeam getTeamTwo() {
        return teamTwo;
    }

}
