package to.lodestone.leadapi.api.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamLeaveEvent extends BaseEvent {

    private final OfflinePlayer player;
    private final ITeam team;

    public PostTeamLeaveEvent(OfflinePlayer player, ITeam team) {
        this.player = player;
        this.team = team;
    }

    public OfflinePlayer getPlayer() {
        return player;
    }

    public ITeam getTeam() {
        return team;
    }

}
