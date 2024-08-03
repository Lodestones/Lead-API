package to.lodestone.leadapi.api.event;

import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PostTeamMergeEvent extends BaseEvent {

    private final ITeam teamOne;
    private final ITeam teamTwo;

    public PostTeamMergeEvent(ITeam teamOne, ITeam teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    public ITeam getTeamOne() {
        return teamOne;
    }

    public ITeam getTeamTwo() {
        return teamTwo;
    }

}
