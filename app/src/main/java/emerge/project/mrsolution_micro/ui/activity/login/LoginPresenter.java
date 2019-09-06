package emerge.project.mrsolution_micro.ui.activity.login;


import android.content.Context;

public interface LoginPresenter {
    void checkLogin(Context context, String userName, String password,boolean rememberMe);
    void checkIsEligiblUseFingerPrint(Context context);


}
