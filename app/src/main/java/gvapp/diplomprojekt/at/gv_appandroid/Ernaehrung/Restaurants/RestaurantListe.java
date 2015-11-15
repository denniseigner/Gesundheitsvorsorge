package gvapp.diplomprojekt.at.gv_appandroid.Ernaehrung.Restaurants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gvapp.diplomprojekt.at.gv_appandroid.Basisklassen.Liste;
import gvapp.diplomprojekt.at.gv_appandroid.Basisklassen.ListenEintrag;

/**
 * Created by Dennis on 14.11.2015.
 */
public class RestaurantListe extends Liste {

    public RestaurantListe() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, container, savedInstanceState);

        ListenEintrag le = new ListenEintrag();
        le.addItem("Breaking News", "Sack Reis umgefallen");
        super.setmAdapter(new RestaurantAdapter(le));

        return v;
    }
}
