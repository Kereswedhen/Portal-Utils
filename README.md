# Portal Utils
![Game Versions](https://img.shields.io/modrinth/game-versions/portal-utils?style=for-the-badge) ![Language](https://img.shields.io/badge/Language-java-red?style=for-the-badge)
![Static Badge](https://img.shields.io/badge/w-GNU_GPLv3-red?style=for-the-badge&label=liscense) ![Modrinth Downloads](https://img.shields.io/modrinth/dt/portal-utils?style=for-the-badge&logo=modrinth)

A simple utility plugin to control access to nether/end portals on PaperMC servers.

Interaction with the plugin is done through Brigadier commands.

## Usage
Commands can only be run by server operators.
| Command | Action |
| :--- | :--- |
| /portals | Shows current Nether and End portal enabled/disabled status and prints a usage message for the following commands. |
| /portals enable end | Enables End portals if currently disabled, broadcasts a title/subtitle to all players, plays the End portal spawn sound, and sends confirmation to the sender. |
| /portals enable nether | Enables Nether portals if currently disabled, broadcasts a title/subtitle to all players, and sends confirmation to the sender. |
| /portals disable end | Disables End portals if currently enabled and sends confirmation to the sender. |
| /portals disable nether | Disables Nether portals if currently enabled and sends confirmation to the sender. |

## Building from source
Portal Utils uses Maven to handle dependencies.

#### Requirements
- Java 25 SDK
- Git

#### Compiling
```sh
git clone https://github.com/Kereswedhen/Portal-Utils
cd Portal-Utils
mvn clean package
```

Builds are found in the `target` folder.

## Contributing
#### Pull requests

If you wish to update the plugin with features or bug fixes you believe to be beneficial, please consider making a pull request.

#### Issues

If you encounter any bugs or other problems with the plugin, please do not hesitate to open an issue. We will try our best to address it promptly.

![Reprot Bug](https://img.shields.io/badge/w-Report_Bug-blue?style=for-the-badge&logo=openbugbounty&label=%E2%80%8D&link=https%3A%2F%2Fgithub.com%2FKereswedhen%2FPortal-Utils%2Fissues%2Fnew%3Ftitle%3D%255BBug%255D%253A%2B%26labels%3Dbug)
![Request Feature](https://img.shields.io/badge/w-Request_Feature-blue?style=for-the-badge&logo=github&label=%E2%80%8D&link=https%3A%2F%2Fgithub.com%2FKereswedhen%2FPortal-Utils%2Fissues%2Fnew%3Ftitle%3D%255BFeature%255D%253A%2B%26labels%3Denhancement)

