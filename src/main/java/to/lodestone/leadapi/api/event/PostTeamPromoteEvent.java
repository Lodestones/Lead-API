package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamPromoteEvent extends BaseEvent {

    private final ITeam team;
    private final Player newLeader;
    private final Player oldLeader;


    public PostTeamPromoteEvent(ITeam team, Player oldLeader, Player newLeader) {
        this.team = team;
        this.oldLeader = oldLeader;
        this.newLeader = newLeader;
    }

    public Player getOldLeader() {
        return oldLeader;
    }

    public Player getNewLeader() {
        return newLeader;
    }

    public ITeam getTeam() {
        return team;
    }

}
