package com.andrew.soccerleagueteams.Interface;

import java.util.List;

public interface SoccerTeams {

    interface SoccerTeamsView {
        void setupTeamsList(List<String> teams);

        void showProgress(boolean show);

        void showMsg(boolean show);
    }

    interface SoccerTeamsPresenter {

    }

    interface SoccerTeamsModel {

    }
}
