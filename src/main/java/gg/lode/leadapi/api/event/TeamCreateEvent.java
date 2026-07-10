package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

/**
 * Fired when a team is created.
 * <p>
 * The creating player may be null for system-created teams.
 * This event is not cancellable.
 * </p>
 */
public class TeamCreateEvent extends BaseEvent {

    private final @Nullable Player player;
    private final ITeam team;


    /**
     * Creates a new TeamCreateEvent.
     *
     * @param team the newly created {@link ITeam}
     * @param player the {@link Player} who created the team, or null for system-created teams
     */
    public TeamCreateEvent(ITeam team, @Nullable Player player) {
        this.player = player;
        this.team = team;
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
     * @return the {@link Player}, or null for system-created teams
     */
    @Nullable
    public Player getPlayer() {
        return player;
    }

}
