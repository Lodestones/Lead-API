package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Fired when a player is invited to a team.
 * <p>
 * This event is cancellable. If cancelled, the invitation is prevented.
 * </p>
 */
public class TeamInviteEvent extends BaseEvent implements Cancellable {

    private final Player sender;
    private final Player target;
    private final ITeam team;

    private boolean isCancelled;

    /**
     * Creates a new TeamInviteEvent.
     *
     * @param team the {@link ITeam} the target is being invited to
     * @param sender the {@link Player} sending the invitation
     * @param target the {@link Player} being invited
     */
    public TeamInviteEvent(ITeam team, Player sender, Player target) {
        this.sender = sender;
        this.target = target;
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
     * Gets the team the target is being invited to.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

    /**
     * Gets the player sending the invitation.
     *
     * @return the inviting {@link Player}
     */
    public Player getSender() {
        return sender;
    }

    /**
     * Gets the player being invited.
     *
     * @return the invited {@link Player}
     */
    public Player getTarget() {
        return target;
    }
}
