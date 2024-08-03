package to.lodestone.leadapi.api.event;

import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamDisbandEvent extends BaseEvent {

    public ITeam team;

    public PostTeamDisbandEvent(ITeam team) {
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }

}
