package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class TeamCreateByPlayerEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private final ITeam team;

    private boolean isCancelled;

    public TeamCreateByPlayerEvent(ITeam team, Player player) {
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

    public ITeam getTeam() {
        return team;
    }

    public Player getPlayer() {
        return player;
    }

}
