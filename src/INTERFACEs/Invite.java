package INTERFACEs;

import TypeEnum.InvitationsToAction;

public interface Invite {
    default void invitefunk(InfoPers pers1, InfoPers pers2, InvitationsToAction where) {
        pers2.setInvite(where);
        System.out.println("'" + pers1.getName() + "' приглашает '" + pers2.getName() + "' " + where);
    }
}
