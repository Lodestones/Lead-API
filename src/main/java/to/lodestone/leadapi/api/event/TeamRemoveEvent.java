package to.lodestone.leadapi.api.event;

import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

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
