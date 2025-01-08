package com.example.wia2007_py2023;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wia2007_py2023.databinding.ItemRecordBinding;

public class RecordListAdapter extends ListAdapter<Record, RecordViewHolder> {
    public RecordListAdapter() {
        super(new RecordDiffUtil());
    }
    @NonNull
    @Override
    public RecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemRecordBinding binding = ItemRecordBinding.inflate(inflater, parent, false);
        return new RecordViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecordViewHolder holder, int position) {
        Record record = getItem(position);
        holder.bind(record);
    }
}

class RecordViewHolder extends RecyclerView.ViewHolder {
    private ItemRecordBinding binding;
    public RecordViewHolder(@NonNull ItemRecordBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Record record) {
        binding.tvDayDisplay.setText(Integer.toString(record.getDay()));
        binding.tvTypeDisplay.setText(record.getType());
        binding.tvAmountDisplay.setText(Integer.toString(record.getAmount()));
    }
}

class RecordDiffUtil extends DiffUtil.ItemCallback<Record> {

    @Override
    public boolean areItemsTheSame(@NonNull Record oldItem, @NonNull Record newItem) {
        return oldItem.recordId == newItem.recordId;
    }

    @Override
    public boolean areContentsTheSame(@NonNull Record oldItem, @NonNull Record newItem) {
        return oldItem.recordId == newItem.recordId;
    }
}
