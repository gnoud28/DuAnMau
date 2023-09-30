package com.example.duanmau.Fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.duanmau.DAO.ThongKeDAO;
import com.example.duanmau.R;

import java.util.Calendar;

public class DoanhThuFragment extends Fragment {



    public DoanhThuFragment() {
        // Required empty public constructor
    }


    public static DoanhThuFragment newInstance() {
        DoanhThuFragment fragment = new DoanhThuFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



}