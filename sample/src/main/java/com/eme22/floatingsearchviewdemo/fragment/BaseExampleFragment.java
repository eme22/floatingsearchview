package com.eme22.floatingsearchviewdemo.fragment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.eme22.floatingsearchview.FloatingSearchView;

/**
 * Created by ari on 8/16/16.
 */
public abstract class BaseExampleFragment extends Fragment {


    private BaseExampleFragmentCallbacks mCallbacks;

    public interface BaseExampleFragmentCallbacks{

        void onAttachSearchViewToDrawer(FloatingSearchView searchView);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof BaseExampleFragmentCallbacks) {
            mCallbacks = (BaseExampleFragmentCallbacks) context;
        } else {
            throw new RuntimeException(context
                    + " must implement BaseExampleFragmentCallbacks");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = null;
    }

    protected void attachSearchViewActivityDrawer(FloatingSearchView searchView){
        if(mCallbacks != null){
            mCallbacks.onAttachSearchViewToDrawer(searchView);
        }
    }

    public abstract boolean onActivityBackPress();
}
