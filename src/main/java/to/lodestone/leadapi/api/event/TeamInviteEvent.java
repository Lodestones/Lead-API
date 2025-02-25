package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class TeamInviteEvent extends BaseEvent implements Cancellable {

    private final Player target;
    private final ITeam team;

    private boolean isCancelled;

    public TeamInviteEvent(ITeam team, Player target) {
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

    public Player getTarget() {
        return target;
    }
}
