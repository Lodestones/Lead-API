package xyz.apollo30.leadapi.api.team;

import java.util.UUID;

/**
 * Represents a member of a {@link ITeam}.
 * @author John Aquino
 */
public interface ITeamMember {

    /**
     * Retrieves the unique identifier (UUID) of the team member.
     *
     * @return The unique identifier (UUID) of the team member.
     */
    UUID getUniqueId();

    /**
     * Retrieves the name of the team member.
     *
     * @return The name of the team member.
     */
    String getName();

    /**
     * Retrieves whether if the team member has team chat activated.
     *
     * @return The team chat state of the team member.
     */
    boolean isInTeamChat();

    /**
     * Sets whether if the player is in team chat.
     *
     * @param status The status of the player's team chat.
     */
    void setInTeamChat(boolean status);
}