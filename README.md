# Portal Utils
![Platform](https://badgen.net/badge/version/Paper%2026.3/orange) ![Languages](https://badgen.net/badge/language/Java/red) ![License](https://badgen.net/badge/license/GNU%20GPLv3/red)

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

[![Report Bug](https://badgen.net/badge/%20/Report%20Bug/red?icon=openbugbounty)](https://github.com/Kereswedhen/Portal-Utils/issues/new?title=%5BBug%5D%3A+&labels=bug)
[![Report Bug](https://badgen.net/badge/%20/Request%20Feature/blue?icon=github)](https://github.com/Kereswedhen/Portal-Utils/issues/new?title=%5BFeature%5D%3A+&labels=enhancement)
