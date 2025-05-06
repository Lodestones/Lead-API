package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;

public class TeamTeleportEvent extends BaseEvent implements Cancellable {

    private final Entity target;
    private final ITeam team;
    private boolean isCancelled;

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }
    public TeamTeleportEvent(ITeam team, Entity target) {
        this.target = target;
        this.team = team;
    }

    public Entity getTarget() {
        return target;
    }

    public ITeam getTeam() {
        return team;
    }

}
