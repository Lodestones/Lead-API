package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PreTeamJoinEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private final ITeam team;
    private boolean isCancelled;

    public PreTeamJoinEvent(ITeam team, Player player) {
        this.player = player;
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }

    public Player getPlayer() {
        return player;
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
