package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class TeamInviteEvent extends BaseEvent implements Cancellable {

    private final Player sender;
    private final Player target;
    private final ITeam team;

    private boolean isCancelled;

    public TeamInviteEvent(ITeam team, Player sender, Player target) {
        this.sender = sender;
        this.target = target;
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

    public Player getSender() {
        return sender;
    }

    public Player getTarget() {
        return target;
    }
}
