package sg.edu.np.twq2.recyclerview;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import sg.edu.np.twq2.recyclerview.R;

public class StudentsAdapter extends RecyclerView.Adapter<StudentViewHolder>{
    private List<String> studentList;
    private Context context;

    public StudentsAdapter(Context context, List<String> sl)
    {
        this.context = context;
        this.studentList = sl;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Log.d("###########","oncreate");

        View item = null;
        //if(viewType == 0)
            item = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_item, parent, false);
        //else
          //  item = LayoutInflater.from(parent.getContext())
            //        .inflate(android.R.layout.simple_list_item_2, parent, false);

        return new StudentViewHolder(item);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, final int position)
    {
        Log.d("###########","onbind "+ position);
        String s = studentList.get(position);
        holder.name.setText(s);

        holder.v.setOnClickListener(new View.OnClickListener()
                                    {

                                        public void onClick(View v)
                                        {
                                            Log.d("xxxxxxxxxxxx","long click " + position);

                                            AlertDialog.Builder builder = new AlertDialog.Builder(context);
                                            builder.setTitle("Delete");
                                            View content = ((Activity)context).getLayoutInflater().inflate(R.layout.dialog, null);
                                            TextView tv = content.findViewById(R.id.content);
                                            tv.setText(studentList.get(position) + "?");

                                            //builder.setMessage("Are you sure you want to delete?");
                                            builder.setView(content);
                                            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    studentList.remove(position);
                                                    notifyDataSetChanged();
                                                    dialogInterface.dismiss();
                                                }
                                            });
                                            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    dialogInterface.cancel();
                                                }
                                            });
                                            builder.show();

                                        }
                                    }
        );
    }

    @Override
    public int getItemCount()
    {
        Log.d("###########","getitem count");
        return studentList.size();
    }

    @Override
    public int getItemViewType(int position)
    {
        Log.d("###########","getType");

        return position % 2;
    }

}
