package to.lodestone.leadapi.api.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class TeamKickEvent extends BaseEvent implements Cancellable {

    private final ITeam team;
    private final OfflinePlayer victim;
    private boolean isCancelled;

    public TeamKickEvent(ITeam team, OfflinePlayer victim) {
        this.team = team;
        this.victim = victim;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    public OfflinePlayer getVictim() {
        return victim;
    }

    public ITeam getTeam() {
        return team;
    }

}
