package to.lodestone.leadapi;

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
    List<ITeam> getTeams();
    ITeam deleteTeam(ITeam team);
    @Nullable
    ITeam getTeam(String name);
    boolean hasTeam(UUID member);
    void update();
    ITeam createTeam(String id, UUID leader, String color) throws TeamAlreadyExistsException;
    ITeam createTeam(String id) throws TeamAlreadyExistsException;
    ITeam createTeam(String id, UUID leader) throws TeamAlreadyExistsException;
    ITeam deleteTeam(String id) throws TeamNotFoundException;
    void removePlayerFromTeam(ITeam team, UUID player);
}
