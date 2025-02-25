package to.lodestone.leadapi.api.event;

import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class TeamChangeIdEvent extends BaseEvent implements Cancellable {

    private final String oldId;
    private final String newId;
    private final ITeam team;


    private boolean isCancelled;

    public TeamChangeIdEvent(ITeam team, String oldId, String newId) {
        this.team = team;
        this.oldId = oldId;
        this.newId = newId;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    public String getNewId() {
        return newId;
    }

    public String getOldId() {
        return oldId;
    }

    public ITeam getTeam() {
        return team;
    }

}
