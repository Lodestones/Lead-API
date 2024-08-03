package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamCreateEvent extends BaseEvent {

    private final Player player;
    private final ITeam team;

    public PostTeamCreateEvent(Player player, ITeam team) {
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
