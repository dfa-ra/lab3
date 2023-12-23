package Scene;

import Action.Movement;
import INTERFACEs.InfoPers;
import TypeEnum.Emotions;
import TypeEnum.InvitationsToAction;
import TypeEnum.Positions;

import java.util.HashMap;
import java.util.Objects;


public class Scene extends Movement{
    protected HashMap<String, InfoPers> Characters = new HashMap<>();

    public void addPerson(String name, InfoPers pers){
        Characters.put(name, pers);
    }

    public void startScene(){
        invite(Characters.get("Queen"), Characters.get("Duchess"), InvitationsToAction.KREKET);
        bowing(Characters.get("Queen"), Characters.get("Duchess"), 15);
        runAway(Characters.get("Alisa"), Positions.FOREST);
        setEmotion(Characters.get("Alisa"), Emotions.LOUD_LAUGHTER);
        System.out.println("----------");
        System.out.println(EventHistory);
        System.out.println("----------");
        System.out.println(Characters.get("Alisa").getHairstyle());
        System.out.println(Characters.get("Queen").getHairstyle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scene scene = (Scene) o;
        return Objects.equals(Characters, scene.Characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Characters);
    }

    @Override
    public String toString() {
        return "Scene{" +
                "Characters=" + Characters +
                '}';
    }
}
