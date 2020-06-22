package mg.didavid.firsttry.Controllers.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mg.didavid.firsttry.R;

public class Page2Fragment extends Fragment {

    public static Page2Fragment newInstance() {
        return (new Page2Fragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2, container, false);
    }
}
