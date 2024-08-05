package to.lodestone.leadapi.api.event;

import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamChangeIdEvent extends BaseEvent {

    private final String oldId;
    private final String newId;
    private final ITeam team;

    public PostTeamChangeIdEvent(ITeam team, String oldId, String newId) {
        this.team = team;
        this.oldId = oldId;
        this.newId = newId;
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
