package com.databinding.gd3_d_09229.oneway;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.databinding.gd3_d_09229.R;
import com.databinding.gd3_d_09229.databinding.OneWayBinding;

import java.util.ArrayList;

public class TampilPegawai extends AppCompatActivity {

    ArrayList<Pegawai> PegawaiList;
    OneWayBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.one_way);

        PegawaiList = new DaftarPegawai().Pegawai;
        binding.setPgw(PegawaiList.get(3));
    }
}
