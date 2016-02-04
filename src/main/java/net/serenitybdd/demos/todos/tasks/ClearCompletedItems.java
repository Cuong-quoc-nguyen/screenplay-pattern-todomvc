package net.serenitybdd.demos.todos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.demos.todos.user_interface.ToDoList.CLEAR_COMPLETED;

public class ClearCompletedItems implements Task {

    @Step("{0} clears all the completed items")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLEAR_COMPLETED));
    }
}