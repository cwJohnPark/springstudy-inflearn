package me.cwpark.inflearnspringbootstudy.databinding.propertyeditor;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Event event = (Event) getValue(); // getValue()는 서로 다른 쓰레드에도 공유됨
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));  // setValue()는 서로 다른 쓰레드에도 공유됨
    }
}
