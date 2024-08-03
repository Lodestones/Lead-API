package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PreTeamTeleportEvent extends BaseEvent implements Cancellable {

    private final Entity target;
    private final ITeam team;
    private boolean isCancelled;

    public PreTeamTeleportEvent(ITeam team, Entity target) {
        this.target = target;
        this.team = team;
    }

    public Entity getTarget() {
        return target;
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
