package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;

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
