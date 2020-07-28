package com.example.dialogmenu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.dialogmenu.databinding.SaveFragmentBinding;

import java.util.ArrayList;
import java.util.List;

public class SaveFragment extends Fragment {

    SaveFragmentBinding binding;
    List<String> StringList;

    public static SaveFragment newInstance() {

        Bundle args = new Bundle();

        SaveFragment fragment = new SaveFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.save_fragment,container,false);
       StringList = new ArrayList<>();

       StringList.add("Android");
       StringList.add("Android");
       StringList.add("Android");
       StringList.add("Android");
       StringList.add("Android");
       StringList.add("Android");
       StringList.add("Android");
       StringList.add("Android");


        ArrayAdapter<String> ArStringArrayAdapter =  new  ArrayAdapter<>(getContext(),android.R.layout.simple_spinner_item,StringList);

        binding.list.setAdapter(ArStringArrayAdapter);

        binding.btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 onDialogShow();
            }
        });

        return binding.getRoot();
    }

    private void onDialogShow()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(getContext()).setTitle("select Alert Dialog").setMessage("Bạn có dồng ý thoát ra hay không").setPositiveButton("Oke", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getContext(),"Đồng ý",Toast.LENGTH_LONG).show();
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(),"Không đồng ý",Toast.LENGTH_LONG).show();
            }
        }).create();

        alertDialog.show();
    }
}
