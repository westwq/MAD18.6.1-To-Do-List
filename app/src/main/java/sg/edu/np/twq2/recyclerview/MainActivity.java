package sg.edu.np.twq2.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> movieList = new ArrayList<String>();
    private RecyclerView recyclerView;
    private StudentsAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*movieList.add("A B");
        movieList.add("C D");
        movieList.add("E F");
        movieList.add("G H");
        movieList.add("I J");
        movieList.add("K L");
        movieList.add("M N");
        movieList.add("O P");
        movieList.add("Q R");
        movieList.add("S T");*/

        //for(int i=0;i<20;i++)
          //  movieList.add("xxxxx" + i);

        recyclerView = (RecyclerView) findViewById(R.id.directory);

        mAdapter = new StudentsAdapter(this, movieList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        //mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }


    public void add(View v)
    {
        EditText et = (EditText)findViewById(R.id.editText);
        movieList.add(et.getText().toString());
        et.setText("");

        recyclerView.scrollToPosition(movieList.size() - 1);

        //InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        //imm.hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
    }
}
