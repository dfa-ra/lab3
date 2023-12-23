package INTERFACEs;

import People.Person;
import TypeEnum.Emotions;

public interface HairAction {
    default void HairConfused(InfoPers pers1, InfoPers pers2){
        System.out.println(pers1.getHairstyle() + " спутались");
        pers1.setEmotion(Emotions.SADNESS);
        pers2.setEmotion(Emotions.SADNESS);
    }

    default void AlmostHairConfused(InfoPers pers1, InfoPers pers2){
        System.out.println(pers1.getHairstyle() + " почти спутались");
    }
}
