package sg.edu.np.twq2.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class BrandsAdapter extends RecyclerView.Adapter<BrandViewHolder>{
    private List<String> brandsList;

    public BrandsAdapter(List<String> sl)
    {
        this.brandsList = sl;
    }

    @Override
    public BrandViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View item = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.layout_item, parent, false);

        return new BrandViewHolder(item);
    }

    @Override
    public void onBindViewHolder(BrandViewHolder holder, final int position)
    {
        String s = brandsList.get(position);
        holder.name.setText(s);

        holder.v.setOnClickListener(new View.OnClickListener()
                                        {

                                            public void onClick(View v)
                                            {
                                                Log.d("xxxxxxxxxxxx","long click " + position);
                                                //return true;
                                            }
                                        }

        );
    }

    @Override
    public int getItemCount()
    {
        return brandsList.size();
    }
}
