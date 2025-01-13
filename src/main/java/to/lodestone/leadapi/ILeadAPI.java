package to.lodestone.leadapi;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;
import to.lodestone.leadapi.api.GeneratorType;
import to.lodestone.leadapi.api.ITeam;
import to.lodestone.leadapi.api.exception.MaxTeamLimitException;
import to.lodestone.leadapi.api.exception.TeamAlreadyExistsException;
import to.lodestone.leadapi.api.exception.TeamNotFoundException;

import java.util.List;
import java.util.UUID;

public interface ILeadAPI {
    void save();
    @Nullable
    ITeam getTeam(UUID member);
    List<ITeam> getTeams();
    ITeam deleteTeam(ITeam team);
    @Nullable
    ITeam getTeam(String name);
    boolean hasTeam(UUID member);
    void update();

    ITeam createTeamWithUniqueColor(Player player, String id, String name) throws MaxTeamLimitException, TeamAlreadyExistsException;
    ITeam createTeamByType(Player player, String name, GeneratorType generatorType) throws MaxTeamLimitException, TeamAlreadyExistsException;
    ITeam createTeamByType(Player player, GeneratorType teamType) throws MaxTeamLimitException, TeamAlreadyExistsException;
    ITeam createTeamByColor(String id, UUID leader, String color) throws TeamAlreadyExistsException;
    ITeam createTeamById(String id) throws TeamAlreadyExistsException;
    ITeam createTeamWithLeader(String id, UUID leader) throws TeamAlreadyExistsException;
    ITeam deleteTeam(String id) throws TeamNotFoundException;
    void removePlayerFromTeam(ITeam team, UUID player);
    String getAvailableTeamNumber();
}
