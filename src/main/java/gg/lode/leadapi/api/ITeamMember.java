package gg.lode.leadapi.api;

import java.util.UUID;

/**
 * Represents a member of a team.
 * Provides access to player information and team chat settings for individual members.
 */
public interface ITeamMember {

    /**
     * Retrieves the unique identifier of this team member.
     *
     * @return The {@link UUID} of the player.
     */
    UUID getUniqueId();

    /**
     * Retrieves the name of this team member.
     *
     * @return The player's name as a {@link String}.
     */
    String getName();

    /**
     * Checks if this team member is in team chat mode.
     *
     * @return {@code true} if the member is actively chatting in the team channel, otherwise {@code false}.
     */
    boolean isInTeamChat();

    /**
     * Sets whether this team member is in team chat mode.
     *
     * @param status {@code true} to enable team chat, {@code false} to disable.
     */
    void setInTeamChat(boolean status);

}
