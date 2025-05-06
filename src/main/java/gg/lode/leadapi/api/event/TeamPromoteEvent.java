package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class TeamPromoteEvent extends BaseEvent implements Cancellable {

    private final ITeam team;
    private final Player newLeader;
    private final Player oldLeader;
    private boolean isCancelled;

    public TeamPromoteEvent(ITeam team, Player oldLeader, Player newLeader) {
        this.team = team;
        this.oldLeader = oldLeader;
        this.newLeader = newLeader;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    public Player getOldLeader() {
        return oldLeader;
    }

    public Player getNewLeader() {
        return newLeader;
    }

    public ITeam getTeam() {
        return team;
    }

}
