package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

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
