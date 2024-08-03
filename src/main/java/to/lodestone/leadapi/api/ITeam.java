package to.lodestone.leadapi.api;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.scoreboard.Team;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface ITeam {

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
     * Get the team's name as a number.
     *
     * @return The teams name as a {@link Integer}
     */
    int getNameAsNumber() throws NumberFormatException;

    /**
     * Retrieves all active invitations sent out by the {@link Team}.
     *
     * @return A list of {@link UUID}s representing active invitations.
     */
    ArrayList<UUID> getInvitations();

    /**
     * Retrieves the hexadecimal color representation (e.g., "#FF0000" for Red) of the {@link Team}.
     *
     * @return The hexadecimal color code of the {@link Team}.
     */
    String getColor();

    void setName(String name);

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

    List<ITeamMember> getMembers();

    /**
     * Saves the state of this {@link Team} to a specific {@link FileConfiguration}.
     * Use with caution, typically for backups or external data handling.
     *
     * @param file {@link FileConfiguration} slay queen.
     */
    void save(FileConfiguration file);

    String getName();
}
