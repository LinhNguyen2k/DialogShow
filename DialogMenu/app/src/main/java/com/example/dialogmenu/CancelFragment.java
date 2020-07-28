package com.example.dialogmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.dialogmenu.databinding.CancelFragmentBinding;
import com.example.dialogmenu.databinding.SaveFragmentBinding;

public class CancelFragment extends Fragment {

    CancelFragmentBinding binding;

    public static CancelFragment newInstance() {

        Bundle args = new Bundle();

        CancelFragment fragment = new CancelFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.cancel_fragment,container,false);

        return binding.getRoot();
    }
}
