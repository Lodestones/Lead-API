package to.lodestone.leadapi.api.event;

import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class TeamDisbandEvent extends BaseEvent implements Cancellable {

    public ITeam team;

    private boolean isCancelled;

    public TeamDisbandEvent(ITeam team) {
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

}
