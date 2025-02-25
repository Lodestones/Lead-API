package to.lodestone.leadapi.api.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class TeamLeaveEvent extends BaseEvent implements Cancellable {

    private final OfflinePlayer player;
    private final ITeam team;

    private boolean isCancelled;

    public TeamLeaveEvent(OfflinePlayer player, ITeam team) {
        this.player = player;
        this.team = team;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    public OfflinePlayer getPlayer() {
        return player;
    }

    public ITeam getTeam() {
        return team;
    }

}
