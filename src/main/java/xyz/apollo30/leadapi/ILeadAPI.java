package xyz.apollo30.leadapi;

import org.jetbrains.annotations.Nullable;
import xyz.apollo30.leadapi.api.team.ITeam;
import xyz.apollo30.leadapi.internal.Service;

import java.util.List;
import java.util.UUID;

/**
 * Official API of the Lead Plugin
 * This interface allows access to certain internals of the teams plugin.
 *
 * @author Apollo
 */
public interface ILeadAPI extends Service {

    /**
     * Updates the tab list, ensuring that all teams are up-to-date.
     * @author Apollo
     */
    void updateTab();

    /**
     * Fetches all active teams, even ones that are offline.
     * @return {@link List<ITeam>} All active teams.
     */
    List<ITeam> getTeams();

    /**
     * Fetches an {@link ITeam} based off of its number.
     *
     * @param number The number of the {@link ITeam}
     * @return {@link ITeam} If present, an {@link ITeam}. Otherwise null.
     */
    @Nullable
    ITeam getTeam(int number);

    /**
     * Fetches an {@link ITeam} based off of whether it contains a {@link org.bukkit.entity.Player}'s {@link UUID}.
     *
     * @param uniqueId A {@link org.bukkit.entity.Player}'s {@link UUID}
     * @return {@link ITeam} If present, an {@link ITeam}. Otherwise null.
     */
    @Nullable
    ITeam getTeam(UUID uniqueId);

}
