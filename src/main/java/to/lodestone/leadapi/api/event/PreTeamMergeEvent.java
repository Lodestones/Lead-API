package to.lodestone.leadapi.api.event;

import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PreTeamMergeEvent extends BaseEvent implements Cancellable {

    private final ITeam teamOne;
    private final ITeam teamTwo;
    private boolean isCancelled;

    public PreTeamMergeEvent(ITeam teamOne, ITeam teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    public ITeam getTeamOne() {
        return teamOne;
    }

    public ITeam getTeamTwo() {
        return teamTwo;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }
}
