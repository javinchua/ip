package duke.command;

import duke.tasks.Todo;
import duke.tasks.TaskList;
import duke.util.Ui;
import duke.util.Storage;

/**
 * Represents a duke.command to add a to-do task to the task list.
 * <p>
 * The {@code AddTodoCommand} class encapsulates the details of the to-do,
 * specifically its description. When executed, the to-do is added to the
 * task list and the list is saved using the provided storage.
 * </p>
 */
public class AddTodoCommand extends Command {

    /**
     * Description of the to-do task.
     */
    private final String description;

    /**
     * Constructs a new {@code AddTodoCommand} with the provided description.
     *
     * @param description Description of the to-do task.
     */
    public AddTodoCommand(String description) {
        this.description = description;
    }

    /**
     * Executes the duke.command by adding a new to-do to the provided task list,
     * and saving the updated list using the provided storage.
     *
     * @param tasks List of duke.tasks.
     * @param ui User interface.
     * @param storage Storage system.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.addTask(new Todo(description));
        storage.save(tasks.getTasks());
    }

    /**
     * Indicates that this duke.command doesn't terminate the application.
     *
     * @return {@code false} since this duke.command doesn't cause the application to exit.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
