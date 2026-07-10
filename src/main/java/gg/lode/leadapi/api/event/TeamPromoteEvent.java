package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Fired when leadership of a team is transferred from one player to another. This event is cancellable; cancelling prevents the promotion.
 */
public class TeamPromoteEvent extends BaseEvent implements Cancellable {

    private final ITeam team;
    private final Player newLeader;
    private final Player oldLeader;
    private boolean isCancelled;

    /**
     * Creates a new TeamPromoteEvent.
     *
     * @param team the team whose leadership is being transferred
     * @param oldLeader the current leader
     * @param newLeader the new leader
     */
    public TeamPromoteEvent(ITeam team, Player oldLeader, Player newLeader) {
        this.team = team;
        this.oldLeader = oldLeader;
        this.newLeader = newLeader;
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
     * Gets the previous leader of the team.
     *
     * @return the old leader
     */
    public Player getOldLeader() {
        return oldLeader;
    }

    /**
     * Gets the new leader of the team.
     *
     * @return the new leader
     */
    public Player getNewLeader() {
        return newLeader;
    }

    /**
     * Gets the team whose leadership is being transferred.
     *
     * @return the team
     */
    public ITeam getTeam() {
        return team;
    }

}
