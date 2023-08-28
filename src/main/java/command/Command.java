package command;

import tasks.TaskList;
import util.Ui;
import util.Storage;

/**
 * Represents an abstract command that can be executed in the application.
 */
public abstract class Command {

    /**
     * Executes the specific command using the provided task list, user interface, and storage system.
     *
     * @param tasks List of tasks.
     * @param ui User interface.
     * @param storage Storage system.
     * @throws Exception If there's any error during the command execution.
     */
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws Exception;

    /**
     * Checks if this command triggers an exit from the application.
     *
     * @return {@code true} if the command causes the application to exit, otherwise {@code false}.
     */
    public abstract boolean isExit();
}
