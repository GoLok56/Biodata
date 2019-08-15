package io.github.golok.biodata.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import io.github.golok.biodata.login.LoginActivity;
import io.github.golok.biodata.utils.SharedPreferencesUtil;

public abstract class BaseFragment extends Fragment {
    protected void logout() {
        Context context = getContext();
        Activity activity = getActivity();

        if (context != null && activity != null) {
            SharedPreferencesUtil.clear(context);

            Intent intent = new Intent(context, LoginActivity.class);
            context.startActivity(intent);
            activity.finish();
        }
    }
}
