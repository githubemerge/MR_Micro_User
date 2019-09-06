package emerge.project.mrsolution_micro.ui.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by attract on 3/12/15.
 */

public class MontserratRegularEdittext extends EditText {
    public MontserratRegularEdittext(Context context) {
        super(context);
        init();
    }

    public MontserratRegularEdittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MontserratRegularEdittext(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Montserrat-Regular.otf");
        setTypeface(tf);
    }
}
