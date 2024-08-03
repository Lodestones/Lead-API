package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamJoinEvent extends BaseEvent {

    private final Player player;
    private final ITeam team;

    public PostTeamJoinEvent(ITeam team, Player player) {
        this.player = player;
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }

    public Player getPlayer() {
        return player;
    }
}
