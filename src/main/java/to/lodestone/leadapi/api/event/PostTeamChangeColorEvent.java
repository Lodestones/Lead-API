package to.lodestone.leadapi.api.event;

import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamChangeColorEvent extends BaseEvent {

    private final String oldColor;
    private final String newColor;
    private final ITeam team;

    public PostTeamChangeColorEvent(ITeam team, String oldColor, String newColor) {
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

}
