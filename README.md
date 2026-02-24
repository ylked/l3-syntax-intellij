# L3 Syntax highlighter for IntelliJ

<!-- Plugin description -->
Syntax highlighter for the L3 language of the EPFL CS-420 course. 
<!-- Plugin description end -->

## Disclaimer

This Plugin is in early development stage and is likely to contain errors
or inconsistencies. Feel free to report the errors you may encounter.

## Installation

### Using pre-built release

Select the last release on the right pane of the GitHub repository home and
download the ZIP file.

In IntelliJ, go to Settings -> Plugins, then click on the gear icon and select "Install Plugin from Disk..." and
choose the downloaded ZIP file.

### Build from source

Using Gradle, run the task `buildPlugin`

```shell
./gradlew buildPlugin
```

This will create a `.zip` file in `./build/distributions`. 

In IntelliJ, go to Settings -> Plugins, then click on the gear icon and select "Install Plugin from Disk..." and
choose the generated ZIP file.


## Acknowledgments

Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation

Development has been guided by JetBrains [Custom Language Support Tutorial](https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html)