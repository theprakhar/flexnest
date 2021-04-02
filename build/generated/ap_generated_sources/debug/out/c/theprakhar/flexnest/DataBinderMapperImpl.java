package c.theprakhar.flexnest;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import c.theprakhar.flexnest.databinding.ActivityMainBindingImpl;
import c.theprakhar.flexnest.databinding.HeaderBindingImpl;
import c.theprakhar.flexnest.databinding.StoryItemBindingImpl;
import c.theprakhar.flexnest.databinding.UserFeedBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_HEADER = 2;

  private static final int LAYOUT_STORYITEM = 3;

  private static final int LAYOUT_USERFEED = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(c.theprakhar.flexnest.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(c.theprakhar.flexnest.R.layout.header, LAYOUT_HEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(c.theprakhar.flexnest.R.layout.story_item, LAYOUT_STORYITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(c.theprakhar.flexnest.R.layout.user_feed, LAYOUT_USERFEED);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_HEADER: {
          if ("layout/header_0".equals(tag)) {
            return new HeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for header is invalid. Received: " + tag);
        }
        case  LAYOUT_STORYITEM: {
          if ("layout/story_item_0".equals(tag)) {
            return new StoryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for story_item is invalid. Received: " + tag);
        }
        case  LAYOUT_USERFEED: {
          if ("layout/user_feed_0".equals(tag)) {
            return new UserFeedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_feed is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
      sKeys.put(2, "itemClick");
      sKeys.put(3, "storyAdapter");
      sKeys.put(4, "feed_adapter");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", c.theprakhar.flexnest.R.layout.activity_main);
      sKeys.put("layout/header_0", c.theprakhar.flexnest.R.layout.header);
      sKeys.put("layout/story_item_0", c.theprakhar.flexnest.R.layout.story_item);
      sKeys.put("layout/user_feed_0", c.theprakhar.flexnest.R.layout.user_feed);
    }
  }
}
