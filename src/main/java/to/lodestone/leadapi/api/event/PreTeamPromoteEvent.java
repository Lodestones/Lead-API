package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class PreTeamPromoteEvent extends BaseEvent implements Cancellable {

    private final ITeam team;
    private final Player newLeader;
    private final Player oldLeader;
    private boolean isCancelled;


    public PreTeamPromoteEvent(ITeam team, Player oldLeader, Player newLeader) {
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

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        isCancelled = b;
    }

}
