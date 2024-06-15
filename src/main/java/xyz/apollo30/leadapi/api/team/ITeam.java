package xyz.apollo30.leadapi.api.team;

import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;
import xyz.apollo30.leadapi.exception.NumberOutOfRangeException;
import xyz.apollo30.leadapi.exception.OccupiedTeamNumberException;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

/**
 * Represents a Team.
 * @author John Aquino
 */
public interface ITeam {

    // TODO: 6/15/24 - Possible configurable color selection?
    String[] AVAILABLE_COLORS = {
            "#C36BFF",
            "#FF2DEA",
            "#FF0569",
            "#FF2600",
            "#FF9307",
            "#FFFF02",
            "#6EFF07",
            "#89FF89",
            "#5BFFEE",
            "#6D68FF",
            "#F59EFF",
            "#FFBA8C",
            "#FFF9BC",
            "#B7FFC3",
            "#89D3FF",
            "#D260FF",
            "#FF665B",
            "#7FFFBB",
            "#32B0FF"
    };

    /**
     * Retrieves a list of all members of the {@link ITeam}.
     *
     * @return A {@link List} containing all {@link ITeamMember} objects in the team.
     */
    List<ITeamMember> getMembers();

    /**
     * Retrieves the number associated with the {@link ITeam}.
     *
     * @return The number associated with the {@link ITeam}.
     */
    int getNumber();

    /**
     * Sets the number of an {@link ITeam} to the specified value.
     *
     * @param number The number to set. Must be in the range from 1 to 999.
     * @throws NumberOutOfRangeException if the number is out of the allowed range (1-999).
     * @throws OccupiedTeamNumberException if the number is already occupied by another team.
     */
    void setNumber(int number) throws NumberOutOfRangeException, OccupiedTeamNumberException;

    /**
     * Returns the UUID of the leader of the {@link ITeam}.
     *
     * @return The leader's {@link UUID}.
     */
    @NotNull
    UUID getLeaderUniqueId();

    /**
     * Checks if a {@link org.bukkit.entity.Player} with the given {@link UUID} is a member of the {@link ITeam}.
     *
     * @param uniqueId The {@link UUID} of the {@link org.bukkit.entity.Player} to check.
     * @return {@code true} if the player is a member of the {@link ITeam}, otherwise {@code false}.
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
     * Removes a {@link org.bukkit.entity.Player} from the {@link ITeam}, if present.
     *
     * @param uniqueId The {@link UUID} of the {@link org.bukkit.entity.Player} to remove.
     *                 If the player is not in the team, nothing happens.
     *                 It's important to manually notify the team about the player's removal.
     */
    void removeMember(UUID uniqueId);

    /**
     * Retrieves all active invitations sent out by the {@link ITeam}.
     *
     * @return A list of {@link UUID}s representing active invitations.
     */
    List<UUID> getInvitations();

    /**
     * Retrieves the hexadecimal color representation (e.g., "#FF0000" for Red) of the {@link ITeam}.
     *
     * @return The hexadecimal color code of the {@link ITeam}.
     */
    String getColor();

    /**
     * Retrieves the UUID of the {@link ITeam}.
     *
     * @return The UUID of the {@link ITeam}.
     */
    UUID getUniqueId();

    /**
     * Saves the state of this {@link ITeam} to a specific {@link FileConfiguration}.
     * Use with caution, typically for backups or external data handling.
     *
     * @param configuration The {@link FileConfiguration} to which the team state will be saved.
     */
    void save(FileConfiguration configuration);
}
