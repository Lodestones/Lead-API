package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

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
