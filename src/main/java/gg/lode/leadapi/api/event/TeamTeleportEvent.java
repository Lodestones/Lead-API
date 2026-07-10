package gg.lode.leadapi.api.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import gg.lode.leadapi.api.ITeam;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;

/**
 * Fired when an entity is teleported to a team's spawn location. This event is cancellable; cancelling prevents the teleport.
 */
public class TeamTeleportEvent extends BaseEvent implements Cancellable {

    private final Entity target;
    private final ITeam team;
    private boolean isCancelled;

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.isCancelled = b;
    }

    /**
     * Creates a new TeamTeleportEvent.
     *
     * @param team the team whose spawn location the entity is being teleported to
     * @param target the entity being teleported
     */
    public TeamTeleportEvent(ITeam team, Entity target) {
        this.target = target;
        this.team = team;
    }

    /**
     * Gets the entity being teleported.
     *
     * @return the target entity
     */
    public Entity getTarget() {
        return target;
    }

    /**
     * Gets the team whose spawn location the entity is being teleported to.
     *
     * @return the team
     */
    public ITeam getTeam() {
        return team;
    }

}
