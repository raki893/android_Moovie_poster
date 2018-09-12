package com.example.rr.movie_poster;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Movie_list extends ArrayAdapter <String> {
    private Activity context;
    private int[] images;
    private String[] movie_name;
    private String[] release_date;
    private String[] total_income;
    private String[] cast;
    private String[] description;

    Movie_list(@NonNull Context context, int [] images,String [] movie_name,String [] release_date,String [] total_income,String [] cast,String [] description) {
        super(context, R.layout.layout_lay,movie_name);
        this.context = (Activity) context;
        this.images = images;
        this.movie_name = movie_name;
        this.release_date = release_date;
        this.total_income = total_income;
        this.cast = cast;
        this.description = description;
    }
    @SuppressLint("InflateParams")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder;

        if (view == null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.layout_lay, null, true);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        try {
            viewHolder.lay_iv.setImageResource(images[position]);
            viewHolder.tv_name.setText(movie_name[position]);
            viewHolder.tv_rd.setText(release_date[position]);
            viewHolder.tv_income.setText(total_income[position]);
            viewHolder.tv_cast.setText(cast[position]);
            viewHolder.tv_description.setText(description[position]);
        }catch (Exception e){

        }


        return view;
    }
    class ViewHolder{
        ImageView lay_iv;
        TextView tv_name,tv_rd,tv_income,tv_cast,tv_description;

        ViewHolder (View view){
            lay_iv = view.findViewById(R.id.lay_iv);
            tv_name = view.findViewById(R.id.tv_name);
            tv_rd= view.findViewById(R.id.tv_rd);
            tv_income= view.findViewById(R.id.tv_income);
            tv_cast= view.findViewById(R.id.tv_cast);
            tv_description= view.findViewById(R.id.tv_description);
        }
    }
}
