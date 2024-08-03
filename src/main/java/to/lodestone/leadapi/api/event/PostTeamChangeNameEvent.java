package to.lodestone.leadapi.api.event;

import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamChangeNameEvent extends BaseEvent {

    private final String oldName;
    private final String newName;
    private final ITeam team;

    public PostTeamChangeNameEvent(ITeam team, String oldName, String newName) {
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

}
