package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * Fired when a player joins a team via placement.
 * <p>
 * This event is cancellable. If cancelled, the join is prevented.
 * </p>
 */
public class TeamJoinByPlaceEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private final ITeam team;

    private boolean isCancelled;

    /**
     * Creates a new TeamJoinByPlaceEvent.
     *
     * @param team the {@link ITeam} the player is joining
     * @param player the {@link Player} joining the team
     */
    public TeamJoinByPlaceEvent(ITeam team, Player player) {
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
     * Gets the team the player is joining.
     *
     * @return the {@link ITeam}
     */
    public ITeam getTeam() {
        return team;
    }

    /**
     * Gets the player joining the team.
     *
     * @return the {@link Player}
     */
    public Player getPlayer() {
        return player;
    }
}
