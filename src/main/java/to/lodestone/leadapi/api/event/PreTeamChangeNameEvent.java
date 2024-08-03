package to.lodestone.leadapi.api.event;

import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PreTeamChangeNameEvent extends BaseEvent implements Cancellable {

    private final String oldName;
    private final String newName;
    private final ITeam team;
    private boolean isCancelled;

    public PreTeamChangeNameEvent(ITeam team, String oldName, String newName) {
        this.team = team;
        this.oldName = oldName;
        this.newName = newName;
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

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }
}
