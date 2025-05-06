package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

public class TeamChangeNameEvent extends BaseEvent implements Cancellable {

    private final String oldName;
    private final String newName;
    private final ITeam team;

    private boolean isCancelled;

    public TeamChangeNameEvent(ITeam team, String oldName, String newName) {
        this.team = team;
        this.oldName = oldName;
        this.newName = newName;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    public String getNewName() {
        return newName;
    }

    public String getOldName() {
        return oldName;
    }

    public ITeam getTeam() {
        return team;
    }

}
