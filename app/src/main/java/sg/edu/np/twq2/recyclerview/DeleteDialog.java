package sg.edu.np.twq2.recyclerview;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DeleteDialog extends DialogFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saved)
    {
        View v = inflater.inflate(R.layout.dialog, group, false);
        getDialog().setTitle("Title test");
        return v;
    }
}
