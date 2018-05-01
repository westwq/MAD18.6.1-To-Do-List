package sg.edu.np.twq2.recyclerview;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import org.w3c.dom.Text;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public View v;

    public StudentViewHolder(View view)
    {
        super(view);
        v = view;
        name = view.findViewById(R.id.text1);
    }
}
