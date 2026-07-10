package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Fired when a team is created by a player.
 * <p>
 * This event is cancellable. If cancelled, the team creation is prevented.
 * </p>
 */
public class TeamCreateByPlayerEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private final ITeam team;

    private boolean isCancelled;

    /**
     * Creates a new TeamCreateByPlayerEvent.
     *
     * @param team the newly created {@link ITeam}
     * @param player the {@link Player} who created the team
     */
    public TeamCreateByPlayerEvent(ITeam team, Player player) {
        this.player = player;
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
     * Gets the newly created team.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

    /**
     * Gets the player who created the team.
     *
     * @return the {@link Player}
     */
    public Player getPlayer() {
        return player;
    }

}
