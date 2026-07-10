package gg.lode.leadapi.api;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public interface ITeam {

    /**
     * Sets the spawn location for the {@link Team}.
     *
     * @param location The {@link Location} to set as the spawn point.
     */
    void setSpawnLocation(@Nullable Location location);

    /**
     * Retrieves the spawn location of the {@link Team}.
     *
     * @return The {@link Location} of the spawn point, or {@code null} if not set.
     */
    @Nullable
    Location getSpawnLocation();

    /**
     * Checks if a {@link org.bukkit.entity.Player} with the given {@link UUID} is a member of the {@link Team}.
     *
     * @param uniqueId The {@link UUID} of the {@link org.bukkit.entity.Player} to check.
     * @return {@code true} if the player is a member of the {@link Team}, otherwise {@code false}.
     */
    boolean containsMember(UUID uniqueId);

    /**
     * Retrieves the {@link ITeamMember} with the specified {@link UUID}.
     *
     * @param uniqueId The {@link UUID} of the {@link org.bukkit.entity.Player}.
     * @return The {@link ITeamMember} corresponding to the unique ID, or {@code null} if not found.
     */
    @Nullable
    ITeamMember getMember(UUID uniqueId);

    /**
     * Removes a {@link org.bukkit.entity.Player} from the {@link Team}, if present.
     *
     * @param uniqueId The {@link UUID} of the {@link org.bukkit.entity.Player} to remove.
     *                 If the player is not in the team, nothing happens.
     *                 It's important to manually notify the team about the player's removal.
     */
    void removeMember(UUID uniqueId);

    /**
     * Adds a {@link Player} to the {@link Team}.
     *
     * @param player The {@link Player} to add to the team.
     */
    void addMember(Player player);

    /**
     * Adds a {@link ITeamMember} to the {@link Team}.
     *
     * @param player The {@link ITeamMember} to add to the team.
     */
    void addMember(ITeamMember player);

    /**
     * Get the team's name as a number.
     *
     * @return The teams name as a {@link Integer}
     */
    int getNameAsNumber() throws NumberFormatException;

    /**
     * Retrieves all active invitations sent out by the {@link Team}.
     * NOTE: This list is Immutable. Meant for READ ONLY.
     *
     * @return A list of {@link UUID}s representing active invitations.
     */
    List<UUID> getInvitations();

    /**
     * Sends an invitation to a player to join the {@link Team}.
     *
     * @param uniqueId The {@link UUID} of the player to invite.
     */
    void addInvitation(UUID uniqueId);

    /**
     * Removes an invitation for a player.
     *
     * @param uniqueId The {@link UUID} of the player whose invitation should be removed.
     */
    void removeInvitation(UUID uniqueId);

    /**
     * Retrieves the hexadecimal color representation (e.g., "#FF0000" for Red) of the {@link Team}.
     *
     * @return The hexadecimal color code of the {@link Team}.
     */
    String getColor();

    /**
     * Sets the ID of the {@link Team}.
     *
     * @param id The new ID for the team.
     */
    void setId(String id);

    /**
     * Sets the display name of the {@link Team}.
     *
     * @param name The new name for the team.
     */
    void setName(String name);

    /**
     * Retrieves the {@link UUID} of the team leader.
     *
     * @return The {@link UUID} of the leader, or {@code null} if no leader is set.
     */
    @Nullable
    UUID getLeaderUniqueId();

    /**
     * The new color to set for the team.
     *
     * @param color A hex value. (ex. #ff0000 or ff0000)
     */
    void setColor(String color);

    /**
     * Retrieves the UUID of the {@link Team}.
     *
     * @return The UUID of the {@link Team}.
     */
    UUID getUniqueId();

    /**
     * Retrieves all members of the {@link Team}.
     *
     * @return A {@link List} of all {@link ITeamMember}s in this team.
     */
    List<ITeamMember> getMembers();

    /**
     * Saves the state of this {@link Team} to a specific {@link FileConfiguration}.
     * Use with caution, typically for backups or external data handling.
     *
     * @param file {@link FileConfiguration} slay queen.
     */
    void save(FileConfiguration file);

    /**
     * Retrieves the ID of the {@link Team}.
     *
     * @return The team's ID.
     */
    String getId();

    /**
     * Retrieves the display name of the {@link Team}.
     *
     * @return The team's name.
     */
    String getName();

    /**
     * Sets whether the team's name should use the team's color in chat displays.
     *
     * @param value {@code true} to color the team name, {@code false} otherwise.
     */
    void setColorName(boolean value);

    /**
     * Checks if the team's name should be colored in chat displays.
     *
     * @return {@code true} if the team name is colored, otherwise {@code false}.
     */
    boolean shouldColorName();

    /**
     * Sets the collision status for members of the {@link Team}.
     *
     * @param status The {@link Team.OptionStatus} to apply (ALWAYS, NEVER, or PUSH_OTHER_TEAMS).
     */
    void setCollidable(Team.OptionStatus status);

    /**
     * Retrieves the collision status for members of the {@link Team}.
     *
     * @return The {@link Team.OptionStatus} for collision settings.
     */
    Team.OptionStatus getCollidable();

    /**
     * Sets the name tag visibility for members of the {@link Team}.
     *
     * @param status The {@link Team.OptionStatus} to apply (ALWAYS, NEVER, or HIDE_FOR_OTHER_TEAMS).
     */
    void setNameTagVisibility(Team.OptionStatus status);

    /**
     * Retrieves the name tag visibility setting for members of the {@link Team}.
     *
     * @return The {@link Team.OptionStatus} for name tag visibility.
     */
    Team.OptionStatus getNameTagVisibility();

    /**
     * Sets whether friendly fire is allowed between team members.
     *
     * @param value {@code true} to allow friendly fire, {@code false} otherwise.
     */
    void setFriendlyFireAllowed(boolean value);

    /**
     * Checks if friendly fire is allowed between team members.
     *
     * @return {@code true} if friendly fire is enabled, otherwise {@code false}.
     */
    boolean isFriendlyFireAllowed();
}
