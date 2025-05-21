package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

public class TeamResetSpawnEvent extends BaseEvent implements Cancellable {

    private boolean isCancelled;
    private final ITeam team;

    public TeamResetSpawnEvent(ITeam team) {
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
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
