package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamTeleportEvent extends BaseEvent {

    private final Entity target;
    private final ITeam team;

    public PostTeamTeleportEvent(ITeam team, Entity target) {
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
