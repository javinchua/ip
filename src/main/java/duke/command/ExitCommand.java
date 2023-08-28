package duke.command;

import duke.tasks.TaskList;
import duke.util.Ui;
import duke.util.Storage;

/**
 * Represents a duke.command to exit the application.
 * <p>
 * When executed, this duke.command displays an exit message to the user and indicates to the application
 * that it should terminate.
 * </p>
 */
public class ExitCommand extends Command {

    /**
     * Executes the exit duke.command, displaying an exit message to the user.
     *
     * @param tasks List of duke.tasks.
     * @param ui User interface.
     * @param storage Storage system.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showExitMessage();
    }

    /**
     * Specifies that executing an ExitCommand will cause the application to exit.
     *
     * @return {@code true} indicating the application should terminate.
     */
    @Override
    public boolean isExit() {
        return true;
    }
}