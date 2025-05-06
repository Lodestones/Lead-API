package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;

public class TeamDeleteEvent extends BaseEvent {

    public ITeam team;

    public TeamDeleteEvent(ITeam team) {
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }

}
