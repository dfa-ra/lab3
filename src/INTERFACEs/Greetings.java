package INTERFACEs;

import People.Person;

public interface Greetings {
    default void blow(InfoPers pers1, InfoPers pers2) {
        System.out.println(pers1.getName() + " и " + pers2.getName() + " поклонились друг другу");
    }
    default void blow(InfoPers pers1) {
        System.out.println(pers1.getName() + " поклонился");
    }
}
