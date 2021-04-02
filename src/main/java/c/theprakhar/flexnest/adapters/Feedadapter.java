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
import c.theprakhar.flexnest.viewHolders.feedViewHolder;
import c.theprakhar.flexnest.viewHolders.headerViewHolder;

public class Feedadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<User> userArrayList,storyArrayList;
    private ItemClickListener itemClickListener;
    private Context context;
    private int Story_type=0,Post_type=1;

    public Feedadapter( Context context, ItemClickListener itemClickListener) {

        this.context=context;

        this.itemClickListener = itemClickListener;


    }
   public void setUsers(List<User> words){
        userArrayList = words;
        notifyDataSetChanged();
    }
   public void setStories(List<User> words){
        storyArrayList = words;
        notifyDataSetChanged();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if(i==Post_type)
        {View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_feed, viewGroup, false);
        return new feedViewHolder(view);}
        else if(i==Story_type){
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.header, viewGroup, false);
            return new headerViewHolder(view);
        }
        throw  new RuntimeException("Unknown Viewtype");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {

        if (viewHolder instanceof feedViewHolder)
        {  final User userModel = userArrayList.get(position-1);
        ((feedViewHolder)viewHolder).bind(userModel,itemClickListener);

        }
        else if(viewHolder instanceof headerViewHolder)
        {

if(storyArrayList!=null) {
    if (((headerViewHolder) viewHolder).binding.reyclerStories.getAdapter() == null) {
        Stories_adapter adapter = new Stories_adapter(storyArrayList, context, itemClickListener);
        ((headerViewHolder) viewHolder).bind(adapter);

    } else {
        ((headerViewHolder) viewHolder).binding.reyclerStories.getAdapter().notifyDataSetChanged();

    }

}
        }



    }


    @Override
    public long getItemId(int position) {
        return position;
    }




    @Override
    public int getItemCount() {
        if(userArrayList!=null)
        return userArrayList.size() + 1;
        else return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return position == 0 ? Story_type : Post_type;
    }
}