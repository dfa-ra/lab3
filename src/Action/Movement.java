package Action;

import INTERFACEs.*;
import TypeEnum.ActionRightNow;
import TypeEnum.Emotions;
import TypeEnum.Hairstyle.FemaleHairstyle;
import TypeEnum.InvitationsToAction;
import TypeEnum.Positions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public abstract class Movement implements Greetings, Invite, HairAction, INTERFACEs.EventHistory {
    protected ArrayList<HashMap<String, String>> EventHistory = new ArrayList<>();

    public void bowing(InfoPers pers1, InfoPers pers2, int distance){
        EventHistory.add(addEventHistory(new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName(), new InfoPers[] {pers1, pers2}));
        pers1.setAction(ActionRightNow.BOW);
        pers2.setAction(ActionRightNow.BOW);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            System.out.println("Scanning...");
        }
        blow(pers1, pers2);
        if (distance < 10 && pers1.getHairstyle() == FemaleHairstyle.BUCCULA && pers2.getHairstyle() == FemaleHairstyle.BUCCULA)
            HairConfused(pers1, pers2);
        else if (distance < 20 && pers1.getHairstyle() == FemaleHairstyle.BUCCULA && pers2.getHairstyle() == FemaleHairstyle.BUCCULA)
        {
            AlmostHairConfused(pers1, pers2);
            System.out.println("Выглядит смешно");
        }
        pers1.setAction(ActionRightNow.STAY);
        pers2.setAction(ActionRightNow.STAY);
    }
    public void invite(InfoPers pers1, InfoPers pers2, InvitationsToAction invitationsToAction){
        EventHistory.add(addEventHistory(new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName(), new InfoPers[] {pers1, pers2}));
        invitefunk(pers1, pers2, invitationsToAction);
    }
    public void bowing(InfoPers pers1){

        EventHistory.add(addEventHistory(new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName(), new InfoPers[] {pers1}));
        blow(pers1);
    }

    public void runAway(InfoPers pers1, Positions position){
        EventHistory.add(addEventHistory(new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName(), new InfoPers[] {pers1}));
        pers1.setAction(ActionRightNow.RUN);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ie) {
            System.out.println("Scanning...");
        }

        pers1.setPosition(Positions.FOREST);
        pers1.setAction(ActionRightNow.STAY);
    }
    public void runAway(InfoPers pers1){
        EventHistory.add(addEventHistory(new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName(), new InfoPers[] {pers1}));
        pers1.setAction(ActionRightNow.RUN);
        System.out.println(pers1.getName() + ": Убегает");
    }

    public void setEmotion(InfoPers pers1, Emotions emotion){
        EventHistory.add(addEventHistory(new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName(), new InfoPers[] {pers1}));

        //EventHistory.add(addEventHistory("setEmotion", new InfoPers[] {pers1}));
        pers1.setEmotion(emotion);
    }
}
