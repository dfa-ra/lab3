package INTERFACEs;

import TypeEnum.*;
import TypeEnum.Hairstyle.FemaleHairstyle;
import TypeEnum.Hairstyle.KidsHairstyle;

public interface InfoPers<HAIR> {
    void setInvite(InvitationsToAction invite);
    String getName();
    Rank getRank();
    Emotions getEmotions();
    void setEmotion(Emotions emotion);
    void setPosition(Positions position);
    Positions getPosition();
    Gender getGender();
    default HAIR getHairstyle() {
        return null;
    }
    void setAction(ActionRightNow action);
    ActionRightNow getAction();
}
