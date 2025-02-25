package to.lodestone.leadapi.api.event;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;
import to.lodestone.leadapi.api.ITeam;

public class TeamCreateEvent extends BaseEvent {

    private final @Nullable Player player;
    private final ITeam team;


    public TeamCreateEvent(ITeam team, @Nullable Player player) {
        this.player = player;
        this.team = team;
    }

    public ITeam getTeam() {
        return team;
    }

    @Nullable
    public Player getPlayer() {
        return player;
    }

}
