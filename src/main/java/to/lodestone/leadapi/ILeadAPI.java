package to.lodestone.leadapi;

import org.bukkit.scoreboard.Team;
import org.jetbrains.annotations.Nullable;
import to.lodestone.leadapi.api.ITeam;
import to.lodestone.leadapi.api.exception.TeamAlreadyExistsException;
import to.lodestone.leadapi.api.exception.TeamNotFoundException;

import java.util.List;
import java.util.UUID;

public interface ILeadAPI {

    void save();

    @Nullable
    ITeam getTeam(UUID member);

    /**
     * Fetches all active teams, even ones that are offline.
     * @return {@link List<Team>} All active teams.
     */
    List<ITeam> getTeams();

    /**
     * Fetches an {@link Team} based off a number, if it is a number.
     *
     * @param number The number of the {@link Team}
     * @return {@link Team} If present, an {@link Team}. Otherwise null.
     */
    ITeam getTeam(int number);

    /**
     * Fetches an {@link ITeam} based off of its name.
     *
     * @param name The name of the {@link ITeam}
     * @return {@link ITeam} If present, an {@link ITeam}. Otherwise null.
     */
    @Nullable
    ITeam getTeam(String name);

    void update();

    ITeam createTeam(String name) throws TeamAlreadyExistsException;

    ITeam deleteTeam(String name) throws TeamNotFoundException;


}
