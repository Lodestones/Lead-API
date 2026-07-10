package gg.lode.leadapi;

import gg.lode.leadapi.api.GeneratorType;
import gg.lode.leadapi.api.ITeam;
import gg.lode.leadapi.api.exception.MaxTeamLimitException;
import gg.lode.leadapi.api.exception.TeamAlreadyExistsException;
import gg.lode.leadapi.api.exception.TeamNotFoundException;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

/**
 * Main API interface for managing teams in Lead.
 * Provides methods for team creation, retrieval, deletion, and player management.
 */
public interface ILeadAPI {

    /**
     * Saves all team data to persistent storage.
     */
    void save();

    /**
     * Retrieves the team for a player by their unique ID.
     *
     * @param member The {@link UUID} of the player.
     * @return The {@link ITeam} the player belongs to, or {@code null} if not in a team.
     */
    @Nullable
    ITeam getTeam(UUID member);

    /**
     * Retrieves all teams.
     *
     * @return A {@link List} of all {@link ITeam}s.
     */
    List<ITeam> getTeams();

    /**
     * Deletes a team.
     *
     * @param team The {@link ITeam} to delete.
     * @return The deleted {@link ITeam}.
     */
    ITeam deleteTeam(ITeam team);

    /**
     * Retrieves a team by its name.
     *
     * @param name The name of the team.
     * @return The {@link ITeam} with the given name, or {@code null} if not found.
     */
    @Nullable
    ITeam getTeam(String name);

    /**
     * Checks if a player has a team.
     *
     * @param member The {@link UUID} of the player.
     * @return {@code true} if the player is in a team, otherwise {@code false}.
     */
    boolean hasTeam(UUID member);

    /**
     * Synchronizes in-memory team data with persistent storage.
     */
    void update();

    /**
     * Creates a team with a unique generated color.
     *
     * @param player The {@link Player} creating the team.
     * @param id The team ID.
     * @param name The team name.
     * @return The created {@link ITeam}.
     * @throws MaxTeamLimitException If the team creator has reached the maximum number of teams.
     * @throws TeamAlreadyExistsException If a team with the given ID or name already exists.
     */
    ITeam createTeamWithUniqueColor(Player player, String id, String name) throws MaxTeamLimitException, TeamAlreadyExistsException;

    /**
     * Creates a team using the specified generator type, generating the ID and color.
     *
     * @param player The {@link Player} creating the team.
     * @param name The team name.
     * @param generatorType The {@link GeneratorType} to use for generating the team ID.
     * @return The created {@link ITeam}.
     * @throws MaxTeamLimitException If the team creator has reached the maximum number of teams.
     * @throws TeamAlreadyExistsException If a team with the generated ID already exists.
     */
    ITeam createTeamByType(Player player, String name, GeneratorType generatorType) throws MaxTeamLimitException, TeamAlreadyExistsException;

    /**
     * Creates a team using the specified generator type, generating the ID and name.
     *
     * @param player The {@link Player} creating the team.
     * @param teamType The {@link GeneratorType} to use for generating the team ID.
     * @return The created {@link ITeam}.
     * @throws MaxTeamLimitException If the team creator has reached the maximum number of teams.
     * @throws TeamAlreadyExistsException If a team with the generated ID already exists.
     */
    ITeam createTeamByType(Player player, GeneratorType teamType) throws MaxTeamLimitException, TeamAlreadyExistsException;

    /**
     * Creates a team with a specified ID, leader, and color.
     *
     * @param id The team ID.
     * @param leader The {@link UUID} of the team leader.
     * @param color The hexadecimal color code for the team.
     * @return The created {@link ITeam}.
     * @throws TeamAlreadyExistsException If a team with the given ID already exists.
     */
    ITeam createTeamByColor(String id, UUID leader, String color) throws TeamAlreadyExistsException;

    /**
     * Creates a team with a specified ID.
     *
     * @param id The team ID.
     * @return The created {@link ITeam}.
     * @throws TeamAlreadyExistsException If a team with the given ID already exists.
     */
    ITeam createTeamById(String id) throws TeamAlreadyExistsException;

    /**
     * Creates a team with a specified ID and leader.
     *
     * @param id The team ID.
     * @param leader The {@link UUID} of the team leader.
     * @return The created {@link ITeam}.
     * @throws TeamAlreadyExistsException If a team with the given ID already exists.
     */
    ITeam createTeamWithLeader(String id, UUID leader) throws TeamAlreadyExistsException;

    /**
     * Deletes a team by its ID.
     *
     * @param id The ID of the team to delete.
     * @return The deleted {@link ITeam}.
     * @throws TeamNotFoundException If no team with the given ID exists.
     */
    ITeam deleteTeam(String id) throws TeamNotFoundException;

    /**
     * Removes a player from a team.
     *
     * @param team The {@link ITeam} to remove the player from.
     * @param player The {@link UUID} of the player to remove.
     */
    void removePlayerFromTeam(ITeam team, UUID player);

    /**
     * Gets the next available team number for auto-generated team names.
     *
     * @return A string representation of the available team number.
     */
    String getAvailableTeamNumber();
}
