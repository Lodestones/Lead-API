package to.lodestone.leadapi.api;

import java.util.UUID;

public interface ITeamMember {


    UUID getUniqueId();

    String getName();

    boolean isInTeamChat();

    void setInTeamChat(boolean status);

}
