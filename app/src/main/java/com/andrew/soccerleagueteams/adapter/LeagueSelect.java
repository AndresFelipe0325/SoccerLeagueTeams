package com.andrew.soccerleagueteams.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.andrew.soccerleagueteams.R;
import com.andrew.soccerleagueteams.model.CountryItem;

import java.util.List;

public class LeagueSelect extends ArrayAdapter<CountryItem> {

    private Context mContext;
    private List<CountryItem> leagueList;

    public LeagueSelect( Context mContext, List<CountryItem> leagueList) {
        super(mContext, 0, leagueList);
        this.mContext = mContext;
        this.leagueList = leagueList;
    }

    @Nullable
    @Override
    public CountryItem getItem(int position) {
        return leagueList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent){
        CountryItem leagueSelected = leagueList.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.spinner_items, parent, false);
        }

        ImageView flag = convertView.findViewById(R.id.iv_flag);
        TextView leagueName = convertView.findViewById(R.id.tv_country);

        flag.setImageResource(leagueSelected.getCountryFlag());
        leagueName.setText(leagueSelected.getCountryName());


        return  convertView;
    }


}
