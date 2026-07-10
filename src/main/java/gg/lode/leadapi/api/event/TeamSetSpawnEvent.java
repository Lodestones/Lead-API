package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.Location;
import org.bukkit.event.Cancellable;

import javax.annotation.Nullable;

/**
 * Fired when a team's spawn location is set. This event is cancellable; cancelling prevents the spawn from being set.
 */
public class TeamSetSpawnEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final ITeam team;
    @Nullable
    private final Location spawnLocation;

    /**
     * Creates a new TeamSetSpawnEvent.
     *
     * @param team the team whose spawn is being set
     * @param spawnLocation the new spawn location, or null to unset the spawn
     */
    public TeamSetSpawnEvent(ITeam team, @Nullable Location spawnLocation) {
        this.team = team;
        this.spawnLocation = spawnLocation;
    }

    /**
     * Gets the team whose spawn is being set.
     *
     * @return the team
     */
    public ITeam getTeam() {
        return team;
    }

    /**
     * Gets the new spawn location.
     *
     * @return the spawn location, or null if the spawn is being unset
     */
    @Nullable
    public Location getSpawnLocation() {
        return spawnLocation;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }
}
