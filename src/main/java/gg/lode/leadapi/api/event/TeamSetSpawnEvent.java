package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.Location;
import org.bukkit.event.Cancellable;

import javax.annotation.Nullable;

public class TeamSetSpawnEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final ITeam team;
    @Nullable
    private final Location spawnLocation;

    public TeamSetSpawnEvent(ITeam team, @Nullable Location spawnLocation) {
        this.team = team;
        this.spawnLocation = spawnLocation;
    }

    public ITeam getTeam() {
        return team;
    }

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
