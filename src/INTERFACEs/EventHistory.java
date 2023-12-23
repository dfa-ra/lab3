package INTERFACEs;

import java.util.Arrays;
import java.util.HashMap;

public interface EventHistory {

    default HashMap<String, String> addEventHistory(String name_event, InfoPers[] characters_tmp){
        HashMap<String, String> tmp = new HashMap<>();
        tmp.put("Event", name_event);
        tmp.put("Characters", Arrays.toString(characters_tmp));
        return tmp;
    }
}
