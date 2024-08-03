package to.lodestone.leadapi.api.event;

import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PreTeamChangeColorEvent extends BaseEvent implements Cancellable {

    private final String oldColor;
    private final String newColor;
    private final ITeam team;
    private boolean isCancelled;

    public PreTeamChangeColorEvent(ITeam team, String oldColor, String newColor) {
        this.team = team;
        this.oldColor = oldColor;
        this.newColor = newColor;
    }

    public String getNewColor() {
        return newColor;
    }

    public String getOldColor() {
        return oldColor;
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
