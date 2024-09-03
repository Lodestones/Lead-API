# Lead API
Lead API allows you to hook into the Lead Plugin that allows players to create visual based teams to help distinguish who is in whose team.

## Table of Contents
1. [Installing the Lead API](#installation)
2. [What's in the Lead API](#api)
3. [Using the Lead API](#usage)
4. [Contributing to the Lead API](#contributing)
5. [Lead API's License](#license)
6. [Donating to help support the Lead API](#donating)

---

## Donating
Lead among other various plugins I have worked on are free to use!
Please consider donating to my ko-fi! It helps fund other projects that I am passionate about.

[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/E1E6RSLWV)

https://ko-fi.com/apollo30

---

# Installation
Below shows you how to install Lead API into your project.
## Gradle
Add it in your root build.gradle at the end of repositories:
```java
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
		mavenCentral()
		maven { url 'https://jitpack.io' }
        }
    }
```
Add the dependency
```java
    dependencies {
        implementation 'com.github.Lodestones:Lead:beta-v1.0.5'
    }
```
## Maven
Add the JitPack repository to your build file
```xml
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
```
Add the dependency
```xml
    <dependency>
        <groupId>com.github.Lodestones</groupId>
        <artifactId>Lead</artifactId>
        <version>beta-v1.0.5</version>
    </dependency>
```

# Documentation
## API
The Lead API gives you two main classes that can help you with custom plugins that may use Lead. [ITeam](https://github.com/Lodestones/Lead/blob/master/src/main/java/xyz/apollo30/leadapi/api/team/ITeam.java) and [ITeamMember](https://github.com/Lodestones/Lead/blob/master/src/main/java/xyz/apollo30/leadapi/api/team/ITeamMember.java).

To hook into the Lead API, you can use the [LeadHook](https://github.com/Lodestones/Lead/blob/master/src/main/java/xyz/apollo30/leadapi/LeadHook.java) class.

## Usage
Hooking into the Lead API.

```java
import to.lodestone.leadapi.LeadAPI;

public class MainPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    public ILeadAPI lead() { // use this method to access the Lead API.
        return LeadAPI.getApi(); // Retrieve the Lead API from the Hook.       
    }
}
```
Fetching a team based off of a Player's UUID.
```java
Player player = Bukkit.getPlayer("Apollo30");
@Nullable ITeam team = plugin.lead().getTeam(player.getUniqueId());
if (team == null) return; // player doesn't have team.
player.sendMessage(Component.text(String.format("You are in team %s", team.getNumber()))); // "You are in team #45"
```
Fetching a team based off of the team number.
```java
@Nullable ITeam team = plugin.lead().getTeam(5);
if (team == null) return; // Team doesn't exist.
Bukkit.broadcast(Component.text(String.format("Team %s exists!", team.getNumber()))); // "Team #5 exists!"
```

---

# Contributing
See something Lead doesn't support, a bug or something that may be useful? We welcome contributions to improve the Lead API. Open an issue [here](https://github.com/Lodestones/Lead/issues).

---

# License
Lead is protected by [Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International (CC BY-NC-ND 4.0)](https://creativecommons.org/licenses/by-nc/4.0/legalcode.txt). Please view the license [here](https://github.com/Lodestones/Lead/blob/master/LICENSE).