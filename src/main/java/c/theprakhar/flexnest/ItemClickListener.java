package c.theprakhar.flexnest;

import android.view.View;

import c.theprakhar.flexnest.models.User;

public interface ItemClickListener {
    void onContactClick(User user);
    void onStoryClick(User user);
}
