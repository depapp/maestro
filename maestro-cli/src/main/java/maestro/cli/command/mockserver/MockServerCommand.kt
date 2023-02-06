package maestro.cli.command.mockserver

import maestro.cli.App
import picocli.CommandLine

@CommandLine.Command(
    name = "mockserver",
    subcommands = [
        MockServerDeployCommand::class,
        MockServerOpenCommand::class
    ]
)
class MockServerCommand {

    @CommandLine.ParentCommand
    lateinit var app: App

}