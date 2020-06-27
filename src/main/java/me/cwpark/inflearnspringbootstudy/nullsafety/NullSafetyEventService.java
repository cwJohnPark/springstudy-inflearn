package me.cwpark.inflearnspringbootstudy.nullsafety;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class NullSafetyEventService {

    @Nullable // return value not null
    public String createEvent(@NonNull String name) { // parameter not null
        return "hello, " + name;
    }

    @Nullable
    public String createNullEvent(String kee) {
        return null;
    }
}
