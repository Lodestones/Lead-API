package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.event.Cancellable;

public class TeamMergeEvent extends BaseEvent implements Cancellable {

    private final ITeam teamOne;
    private final ITeam teamTwo;

    private boolean isCancelled;

    public TeamMergeEvent(ITeam teamOne, ITeam teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    public ITeam getTeamOne() {
        return teamOne;
    }

    public ITeam getTeamTwo() {
        return teamTwo;
    }

}
