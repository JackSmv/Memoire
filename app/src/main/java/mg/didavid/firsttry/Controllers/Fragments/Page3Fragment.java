package mg.didavid.firsttry.Controllers.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import mg.didavid.firsttry.R;

public class Page3Fragment extends Fragment {

    public static Page3Fragment newInstance() {
        return (new Page3Fragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page3, container, false);
    }
}
