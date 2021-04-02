package c.theprakhar.flexnest.viewHolders;

import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import c.theprakhar.flexnest.adapters.Stories_adapter;
import c.theprakhar.flexnest.databinding.HeaderBinding;

public class headerViewHolder extends RecyclerView.ViewHolder {
    public HeaderBinding binding;
    public headerViewHolder(View view) {
        super(view);
        binding = DataBindingUtil.bind(itemView);


    }
    public void bind(Stories_adapter adapter)
    {
        binding.setStoryAdapter(adapter);
    }
 }
