package to.lodestone.leadapi.api.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PreTeamLeaveEvent extends BaseEvent implements Cancellable {

    private final OfflinePlayer player;
    private final ITeam team;
    private boolean isCancelled;

    public PreTeamLeaveEvent(OfflinePlayer player, ITeam team) {
        this.player = player;
        this.team = team;
    }

    public OfflinePlayer getPlayer() {
        return player;
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
