package events

import aggregates.TodoIdentifier

/**
 * @author Jettro Coenradie
 */
class TodoCreatedEvent {
    TodoIdentifier aggregateIdentifier
    String todoText

    TodoCreatedEvent(TodoIdentifier aggregateIdentifier, String todoText) {
        this.aggregateIdentifier = aggregateIdentifier
        this.todoText = todoText
    }

    TodoIdentifier getIdentifier() {
        return aggregateIdentifier
    }

}
