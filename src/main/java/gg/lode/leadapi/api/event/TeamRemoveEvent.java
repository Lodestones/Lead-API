package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;

import java.util.UUID;

public class TeamRemoveEvent extends BaseEvent {
    private final ITeam team;
    private final UUID uniqueId;

    public TeamRemoveEvent(ITeam team, UUID uniqueId) {
        this.team = team;
        this.uniqueId = uniqueId;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public ITeam getTeam() {
        return team;
    }

}
