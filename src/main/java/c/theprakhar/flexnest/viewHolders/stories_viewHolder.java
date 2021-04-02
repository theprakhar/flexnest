package c.theprakhar.flexnest.viewHolders;

import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import c.theprakhar.flexnest.ItemClickListener;
import c.theprakhar.flexnest.models.User;
import c.theprakhar.flexnest.databinding.StoryItemBinding;


public class stories_viewHolder extends RecyclerView.ViewHolder {


    public StoryItemBinding binding;

    public stories_viewHolder(View view) {
        super(view);
        binding = DataBindingUtil.bind(itemView);


    }

    public void bind(final User item,final ItemClickListener itemClickListener) {
        binding.setItem(item);
        binding.setItemClick(itemClickListener);
        binding.executePendingBindings();



    }

}