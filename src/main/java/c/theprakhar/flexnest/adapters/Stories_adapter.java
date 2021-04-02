package c.theprakhar.flexnest.adapters;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import c.theprakhar.flexnest.ItemClickListener;
import c.theprakhar.flexnest.R;
import c.theprakhar.flexnest.models.User;
import c.theprakhar.flexnest.viewHolders.stories_viewHolder;

public class Stories_adapter extends RecyclerView.Adapter<stories_viewHolder> {
    private List<User> userArrayList;

    private ItemClickListener itemClickListener;
    private Context context;

    public Stories_adapter(List<User> articleArrayList, Context context, ItemClickListener itemClickListener) {
        this.userArrayList = articleArrayList;
        this.context = context;

        this.itemClickListener = itemClickListener;


    }

    @Override
    public stories_viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.story_item, viewGroup, false);
        return new stories_viewHolder(view);
    }

    @Override
    public void onBindViewHolder(stories_viewHolder viewHolder, final int position) {
        final User userModel = userArrayList.get(position);
        viewHolder.bind(userModel,itemClickListener);



    }


    @Override
    public int getItemCount() {
        if(userArrayList!=null)
        return userArrayList.size();
        else return 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

}