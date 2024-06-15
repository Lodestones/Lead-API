# Lead API
Lead API allows you to hook into the Lead Plugin that allows players to create visual based teams to help distinguish who is in whose team.

---

## Donating
Lead among other various utility plugins are free to use!
If you wish to help fund future projects, such as purchasing servers, resources, art, etc... You can donate to my ko-fi!

[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/E1E6RSLWV)

https://ko-fi.com/apollo30

---

# Documentation
## API
The Lead API gives you two main classes that can help you with custom plugins that may use Lead. [ITeam](https://github.com/Lodestones/Lead/blob/master/src/main/java/xyz/apollo30/leadapi/api/team/ITeam.java) and [ITeamMember](https://github.com/Lodestones/Lead/blob/master/src/main/java/xyz/apollo30/leadapi/api/team/ITeamMember.java).

To hook into the Lead API, you can use the [LeadHook](https://github.com/Lodestones/Lead/blob/master/src/main/java/xyz/apollo30/leadapi/LeadHook.java) class.

## Usage
Hooking into the Lead API.
```java
public class MainPlugin extends JavaPlugin {       
    private LeadHook leadHook; // Declare Lead Hook Variable.
    @Override       
    public void onEnable() {           
        leadHook = new LeadHook(this); // Hook into the Lead API.       
    }         
    
    public ILeadAPI lead() { // use this method to access the Lead API.
        return leadHook.api(); // Retrieve the Lead API from the Hook.       
    }  
}
```
Fetching a team based off of a Player's UUID.
```java
Player player = Bukkit.getPlayer("Apollo30");
@Nullable ITeam team = plugin.lead().getTeam(player.getUniqueId());
if (team == null) return; // player doesn't have team.
player.sendMessage(Component.empty(String.format("You are in team #%s", team.getNumber()))); // "You are in team #45"
```
Fetching a team based off of the team number.
```java
@Nullable ITeam team = plugin.lead().getTeam(5);
if (team == null) return; // Team doesn't exist.
Bukkit.broadcast(Component.empty(String.format("Team #%s exists!", team.getNumber()))); // "Team #5 exists!"
```

---

# Contributing
See something Lead doesn't support, a bug or something that may be useful? We welcome contributions to improve the Lead API. Open an issue [here](https://github.com/Lodestones/Lead/issues).

---

# License
Lead is protected by [Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International (CC BY-NC-ND 4.0)](https://creativecommons.org/licenses/by-nc/4.0/legalcode.txt). Please view the license [here](https://github.com/Lodestones/Lead/blob/master/LICENSE).