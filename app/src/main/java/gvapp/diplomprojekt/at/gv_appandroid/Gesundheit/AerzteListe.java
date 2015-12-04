package gvapp.diplomprojekt.at.gv_appandroid.Gesundheit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gvapp.diplomprojekt.at.gv_appandroid.Basisklassen.Liste;
import gvapp.diplomprojekt.at.gv_appandroid.Basisklassen.ListenEintrag;

/**
 * Created by Dennis on 14.11.2015.
 */
public class AerzteListe extends Liste {

    public AerzteListe() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);

        eintraege.add(new ListenEintrag("Breaking News", "Sack Reis umgefallen", null));
        super.setmAdapter(new AerzteAdapter(eintraege));

        return v;
    }
}
