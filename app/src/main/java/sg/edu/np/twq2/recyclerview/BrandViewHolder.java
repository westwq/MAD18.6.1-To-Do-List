package sg.edu.np.twq2.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class BrandViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public View v;

    public BrandViewHolder(View view)
    {
        super(view);
        this.v = view;
        name = view.findViewById(android.R.id.text1);
    }
}
