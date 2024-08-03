package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamInviteEvent extends BaseEvent {

    private final Player target;
    private final ITeam team;

    public PostTeamInviteEvent(ITeam team, Player target) {
        this.target = target;
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }

    public Player getTarget() {
        return target;
    }
}
