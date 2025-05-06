package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

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
