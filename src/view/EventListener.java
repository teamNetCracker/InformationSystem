package view;

import model.Event;

public interface EventListener {
    void update(Event event, Integer id);
}
