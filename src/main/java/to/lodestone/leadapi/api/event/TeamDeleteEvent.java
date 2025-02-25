package to.lodestone.leadapi.api.event;

import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class TeamDeleteEvent extends BaseEvent {

    public ITeam team;

    public TeamDeleteEvent(ITeam team) {
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }

}
