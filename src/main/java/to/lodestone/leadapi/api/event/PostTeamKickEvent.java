package to.lodestone.leadapi.api.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamKickEvent extends BaseEvent {

    private final ITeam team;
    private final OfflinePlayer victim;

    public PostTeamKickEvent(ITeam team, OfflinePlayer victim) {
        this.team = team;
        this.victim = victim;
    }

    public OfflinePlayer getVictim() {
        return victim;
    }

    public ITeam getTeam() {
        return team;
    }

}
